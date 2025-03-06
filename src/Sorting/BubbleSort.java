package Sorting;
/**
 * For shorting here, I am using Bubble Short.
 * → I am taking two loops, the first loop iterate n-1 time.
 * → Zero to last index.
 * → Inside the second loop I am writing swapping functionality to short an array.
 * → Suppose we have five items in our array, but the second loop is running only four times
 * because if four items are sorted, then the fifth item is automatically sorted.
 * That's why I am writing "array.length - i - 1".
 * → After that, I put a condition if "index j" is greater than "index j+1" then it is performing
 * swap operation.
 * → finally, We will get a sorted array.
 **/
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
