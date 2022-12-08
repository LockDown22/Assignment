package Agorithm.Search;
import javax.security.auth.x500.X500PrivateCredential;

import Agorithm.Extensions.SortArr;

public class InterpolationSearch {
    
    int interpolationSearch(int arr[], int x){
        SortArr sort = new SortArr();
        int[] arrAfterSort = sort.sort(arr);
        
        int first = 0, last = arrAfterSort.length-1;

        while(first <= last && x >= arrAfterSort[first]&& x < arrAfterSort[last]){

            //mid value (value1), based on fist + (last - first) * 1/2
            int value1 = (x-arrAfterSort[first])/(arrAfterSort[last]-first);
            
            int value2 = (last-first);
            int target = first + value1*value2;

            if(arrAfterSort[target]==x){
                return target;
            }
            if(arrAfterSort[target] < x){
                first = target+1;
            }else{
                last = target - 1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int arr[] = {1,2,3,5,9,12,14,55};
        int x = 9;
        int result =  interpolationSearch.interpolationSearch(arr, x);

        System.out.println(result);
    }

}
