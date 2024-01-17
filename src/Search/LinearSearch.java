package Search;

import java.util.*;
class LinearSearch{
	int search(int[] arr,int size,int find){
		for (int i = 0;i < size ; i++) {
			if (arr[i] == find)
				return i;
		}
		return -1;
	}

	public static void main(String[] args){
		LinearSearch linearSearch = new LinearSearch();
		Scanner scanner = new Scanner(System.in);
		int[] arr = {10,20,25,27,30,40};
		System.out.println("Enter your number: ");
		int find = scanner.nextInt();
		System.out.println("Length of array: "+arr.length);

		int result = linearSearch.search(arr,arr.length,find);

		if (result == -1) {
			System.out.println("The element is not present");
		} else {
			System.out.println("The element is preset in index: "+result);
		}
	}
}