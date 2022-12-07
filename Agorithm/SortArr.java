public class SortArr{

    public int[] sort(int[] intArray){
        int temp = 0;
        for (int i = 0; i <intArray.length; i++) {     
            for (int j = i+1; j <intArray.length; j++) {     
                if(intArray[i] >intArray[j]) {      //swap elements if not in order
                   temp = intArray[i];    
                   intArray[i] = intArray[j];    
                   intArray[j] = temp;    
                 }     
              }     
          }    
        return intArray;
    }
    


    


}