package conditions_and_loops;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// Program to demonstrate salary bonus
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the salary in whole number :");
		int salary = input.nextInt();
		
		if(salary<=25000) {
			salary+=2500;
		}else if(salary<=50000) {
			salary+=5000;
		}else if(salary<=80000) {
			salary+=10000;
		}else {
			salary+=2000;
		}
		
		System.out.println("Final salary after bonus is :"+salary);

	}

}
