package functions;

public class CheckArmstrongNum {

	public static void main(String[] args) {
		// Program to illustrate Armstrong number
		// Function calling
		System.out.println(isArmstrong(153));
		
		for(int i=100;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.print(i+" ");
			}
			
		}

	}
	// Function definition
	static boolean isArmstrong(int n) {
		int original = n;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum +rem*rem*rem;
			n = n/10;
		}
		return sum==original;
	}

}
