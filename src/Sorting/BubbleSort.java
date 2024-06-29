package Sorting;

public class BubbleSort {
    public static void bubbleSort(int array[]){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++ ){
                if (array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
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
        bubbleSort(array);
        printList(array);
    }
}
