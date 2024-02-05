package Sorting;

public class QuickSort {
    public static int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i = low-1;
        //System.out.println(low);
        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }

    public static void quickSort(int arr[], int low, int high){
        if (low < high){
            int pidx = partition(arr, low, high);
            quickSort(arr,low, pidx - 1);
            quickSort(arr,pidx + 1, high);
        }
    }
    public static void printList(int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {2,4,3,1,100,200,80,50,42,20,27,90};
        int len = array.length;
        System.out.println("Un-sorted list: ");
        printList(array);

        quickSort(array,0, len - 1);

        System.out.println("Sorted list: ");
        printList(array);
    }

}
