package conditions_and_loops;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// Program to find out the largest between 3 number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three num simultaneously :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("The largest is :"+a);
		}else if(b>c) {
			System.out.println("The largest is :"+b);
		}else {
			System.out.println("Largest is :"+c);
		}
		
		

	}

}
