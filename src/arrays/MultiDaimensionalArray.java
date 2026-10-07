package arrays;

import java.util.Arrays;

public class MultiDaimensionalArray {
	public static void main(String[] args) {
		// Program to illustrate over Multidaimensional array
		// Initialization of multidaimensional array
		int[][] arr = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		
		// Traversing through the arrays
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	
	
	// Traversing using for each loop
		System.out.println("Using for each loop :");
	for(int[] num :arr) {
		System.out.println(Arrays.toString(num));
	}

}
}
