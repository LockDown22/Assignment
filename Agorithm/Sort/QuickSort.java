package Agorithm.Sort;
public class QuickSort {

    int quickSort(int arr[], int left, int right) {
        int pivot = arr[(left+right)/2], i = left, j= right;

       while(i<=j){
        while(arr[i]<pivot){
            i++;
        }
        while(arr[j]>pivot){   
            j--;
        }
        if(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
       }
        return i;
    }

    void sort(int arr[], int left, int right) {
        if (left < right) {
            int i = quickSort(arr, left, right);

            if(left < i-1){
                sort(arr, left, i - 1);
            }
            if(i<right){
                sort(arr, i, right);
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int arr[] = { 1, 4, 5, 1, 632, 61, 3, 9 ,10};
        int low = 0;
        int hight = arr.length - 1;

        quickSort.sort(arr, low, hight);

        printArray(arr);

    }
}