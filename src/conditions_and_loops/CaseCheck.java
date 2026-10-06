package conditions_and_loops;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// Program to check whether an alphabet is of lowercase or uppercase
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character to check case :");
		char ch = input.next().trim().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("The given character is lowercase : "+ch);
		}else if(ch>= 'A' && ch<='Z') {
			System.out.println("The given character is uppercase :"+ch);
		}else {
			System.out.println("Enter the alphabet between a to z or A to Z :");
		}

	}

}
