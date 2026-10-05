package basics;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		// Automatic Typecasting (Widening)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in integer format :");
		float marks = input.nextInt();//gonna enter interger value but it will automatically convert it into integer
		System.out.println("marks is :"+marks);

	}

}
/*
 * Typecasting : it is the process of converting one datatpe to another and it is of two types. 1. automatic and 2. manually
 * automatic typecasting : both the data type should be compatible and destination data should be smaller than other.
 * manual typecasting(narrowing) : we need casting operator to perform it and on casting may be some data will loss*/
