package conditions_and_loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// Program to print fibonacci till nth term
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the nth term of Fibonacci series : ");
		int n = input.nextInt();
		
		int a = 0;
		int b = 1;
		
		for(int i = 1; i<=n; i++) {
			System.out.print(a+" ");
			int next = a+b;
			a = b;
			b = next;
		}

	}

}
