package Agorithm.Search;
import java.util.Arrays;

import Agorithm.SortArr;;

public class BinarySearch {

    int binarySearch(int arr[], int x){
            SortArr sort = new SortArr();
        //sort array input
        int[] arrAfterSort = sort.sort(arr);

        int first=0, last = arrAfterSort.length-1;
        
        while(first <= last){
            int mid = (first + last) / 2;
            if(arrAfterSort[mid]==x){
                return mid;
            }
            if(arrAfterSort[mid] < x){
                first = mid+1;
            }else{
                last = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();

        int arr[] = {1,2,3,11,5,6,7,8,9,10};
        int n= arr.length;
        int x = 9;
        int result = ob.binarySearch(arr, x);
        // System.out.println(n);
        System.out.println(result);
    }
}
