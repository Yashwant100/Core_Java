package functions;

import java.util.Scanner;

public class SumOfTwoNum {

	public static void main(String[] args) {
		// Program to create a function to illustarte sum of two number
		
		// Function calling
		sum();
	}
	// Function definition
	static void sum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first num :");
		int first = input.nextInt();
		System.out.println("Enter second num : ");
		int second = input.nextInt();
		int sum = first + second;
		System.out.println("The of two number is :"+sum);
	   
	}

}
