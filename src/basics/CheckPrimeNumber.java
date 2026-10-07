package basics;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		//  Program to check whether a number is prime or not
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a num to check prime or not :");
		int num = input.nextInt();
		int count = 0;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("The given num is "+num+" and it is prime number");
		}

	}

}
