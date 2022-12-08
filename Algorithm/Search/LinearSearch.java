package Agorithm.Search;
public class LinearSearch {
    
    int linearSearch(int arr[], int target){

        for(int i = 0; i<arr.length ; i++){
            if(arr[i]==target){
                return i;
            }else{
                System.out.println("Can't find the target !");
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int arr[] = {1,2,3,4,5,6,71,5};
        int target = 71;
        int result = linearSearch.linearSearch(arr, target);
        
        System.out.println("Position: " + result);
    }
}
