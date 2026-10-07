package functions;

import java.util.Arrays;

public class ChangeValue {
	public static void main(String[] args) {
		// program to illustrate change the value of an array
		int arr[] = {1,2,34,54,45,90};
		change(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void change(int[] nums) {
		nums[0] = 99; // here, we are making change to the array using "nums" refrence variable
	}

}
