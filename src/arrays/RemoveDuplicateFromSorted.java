package arrays;

public class RemoveDuplicateFromSorted {

	public static void main(String[] args) {
		// Program to remove duplicate from an sorted array
		int[] arr = {5,5,6,7,8,8,9,10};
		
		int j = 0;
		
		for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
		
		
		for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
