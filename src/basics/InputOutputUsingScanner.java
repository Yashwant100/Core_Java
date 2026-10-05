package basics;

import java.util.Scanner;

public class InputOutputUsingScanner {

	public static void main(String[] args) {
		// Taking input form the user using Scanner
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.println("Enter a number");
		num = input.nextInt();
		System.out.println("Entered number is :"+num);

	}

}
/*
 * Scanner is a class in java.util pacakge that is used to take input from the user.
 * System.in means we are going to take input from the user from standard input devices of the system/computer.
 * 
 * */
