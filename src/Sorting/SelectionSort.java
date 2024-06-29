package Sorting;

public class SelectionSort {
    public static void selectionSort(int array[]){
        for (int i = 0; i < array.length - 1; i++){
            int smallest = i;
            for (int j = i+1; j < array.length; j++){
                if (array[smallest] > array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }

    public static void printList(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {2,4,3,1,100,200,80,50,42,20,27,90};
        // Time complexity = O(n^2)
        selectionSort(array);
        printList(array);
    }
}
