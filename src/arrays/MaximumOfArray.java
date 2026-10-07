package arrays;

public class MaximumOfArray {

	public static void main(String[] args) {
		// Program to findout maximum number from an array
		int [] arr = {47,65,90,124,65,77,159};
		System.out.println("The highest value in array is : "+max(arr));

	}
	// Function definition
	static int max(int[] num) {
		int high = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>high) {
				high=num[i];
			}
			
		}
		
		return high;
	}

}
