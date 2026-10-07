package arrays;

import java.util.Arrays;

public class SwapValuesOfArray {

	public static void main(String[] args) {
		// Program to illustrate swapping in arrays
		int[] arr = {1,34,78,21,9,11};
		// function calling
		System.out.println("Before swapping the values in array :");
		System.out.println(Arrays.toString(arr));
		swap(arr,1,3);
		System.out.println("After swapping the values in array :");
		System.out.println(Arrays.toString(arr));
		

	}
	// Function definition
	static void swap(int[] num, int index1, int index2) {
		int temp = num[index1];
		num[index1] = num[index2];
		num[index2] = temp;
		
	}

}
