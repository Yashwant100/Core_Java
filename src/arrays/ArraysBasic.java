package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasic {

	public static void main(String[] args) {
		// Array declaration and initialization
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		          // OR
		int[] arr1 = {1,2,3,4,5};
		
		// input in array using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element :");
			arr[i] = in.nextInt();
			
		}
		
		// Traversing through the array using for loop
		System.out.println("Using for loop :");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		// Traversing using for loop
		System.out.println();
		System.out.println("Using Arrays.toString() method : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Using For Each loop :");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		

	}

}
/*
 * Array : Array is a collection of homogeneous data elements present at contigous memory location and it is fixed in 
 *         size and indexing starts from 0 to n-1.
 *         
 *         imp : in java array may be not present at contiguous memory location because objects are created in heap 
 *               and it totally dependent on JVM whether it provides contiguous memory or not.
 *               
 *         new : new is reserved keyword in java which is used to create objects and memory in heap.
 *         bydefualt all the elements in an array are initialized with 0 and null for string array.
 *         
 */
