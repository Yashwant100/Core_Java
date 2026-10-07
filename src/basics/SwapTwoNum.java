package basics;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		// Program to illustrate Swapping of two number
		Scanner input = new Scanner(System.in);
		int a,b,temp;
		
		System.out.println("Enter the first number :");
		a = input.nextInt();
		System.out.println("Enter the second number :");
		b = input.nextInt();
		
		System.out.println("Befor swapping the value of a is : "+a+" and b is : "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping the value of a is : "+a+" and b is : "+b);
		

	}

}
