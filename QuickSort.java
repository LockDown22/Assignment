public class QuickSort {

    int quickSort(int arr[], int low, int high) {

        //pivot là chốt
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            //check value tại vị trí index có nhỏ hơn điểm chốt không, nếu có thì đổi chỗ 
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {

            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pi = quickSort(arr, low, high);

            // Sắp xếp đệ quy các phần tử
            // trướcphân vùng và sau phân vùng
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
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
        int arr[] = { 1, 4, 5, 1, 632, 61, 3, 9 };
        int low = 0;
        int hight = arr.length - 1;

        quickSort.sort(arr, low, hight);

        printArray(arr);

    }
}