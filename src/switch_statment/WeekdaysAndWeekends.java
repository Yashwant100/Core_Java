package switch_statment;

import java.util.Scanner;

public class WeekdaysAndWeekends {

	public static void main(String[] args) {
		// Program to print weekdays and weekends
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 to 7");
		int day = input.nextInt();
		
		switch(day) {
		case 1 : 
		case 2 :
		case 3 :
		case 4 :
		case 5 : System.out.println("Weekdays");
		break;
		case 6 :
		case 7 : System.out.println("Weekend");
		break;
		default : System.out.println("Please choose between 1 to 7.");
		}

	}

}
