package conditions_and_loops;

import java.util.Scanner;

public class CountOccurances {

	public static void main(String[] args) {
		// Program to count occurance of a digit in a number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = input.nextInt();
		
		System.out.println("Enter a number to count in above given number :");
		int digit = input.nextInt();
		
		int count =0;
		while(num>0) {
			int rem = num%10;
			if(rem==digit) {
				count++;
			}
			
			num = num/10;
		}
		
		System.out.println("The given number "+digit+" is occured "+count+" Times");

	}

}
