public class BinarySearch {
    int binarySearch(int arr[], int x){
        int first=0, last = arr.length-1;
        while(first <= last){
            int mid = (first + last) / 2;

            if(arr[mid]==x){
                return mid;
            }

            if(arr[mid] < x){
                first = mid+1;
            }else{
                last = mid - 1;
            }


        }


        return -1;
    }


    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        int x = 9;
        int result = ob.binarySearch(arr, x);
        // System.out.println(n);
        System.out.println(result);
    }
}
