package arrays;

import java.util.Arrays;

public class RemoveDuplicateFromUnsorted {

	public static void main(String[] args) {
		// Program to remove element from unsorted array
		int[] arr = {4,7,2,5,9,12,43,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
			
		}
		
		for(int i=0;i<=j;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
