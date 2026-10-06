package conditions_and_loops;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		// Program to print a number in reverse order
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a num which is printed to be in reverse :");
		int num = input.nextInt();
		int num1 = num;
		int reverse = 0;
		while(num>0) {
			int rem = num%10;
			reverse = reverse*10+rem;
			num = num/10;
		
		}
		
		System.out.println("Given number is "+num1+" and reverse number is "+reverse);
	}
	

}
