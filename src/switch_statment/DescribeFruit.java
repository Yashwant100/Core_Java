package switch_statment;

import java.util.Scanner;

public class DescribeFruit {

	public static void main(String[] args) {
		// Program to demonstarte the use of switch statemnt
		Scanner input = new Scanner(System.in);
		System.out.println("please enter from the given one : Mango, Apple, Strawberry, Grapes, Watermelon");
		String fruit = input.next();
		
		switch(fruit) {
		case "Apple" : 
			System.out.println("A red sweet fruit.");
			break;
			
		case "Mango" : 
			System.out.println("The king of fruit.");
			break;
			
		case "Grapes" :
			System.out.println("A small fruits.");
			break;
			
		case "Orange" : 
			System.out.println("A round fruit.");
			break;
			
		case "Strawberry" :
			System.out.println("The seeds outside of the fruit.");
			break;
			
		case "Watermelon" :
			System.out.println("The king of summer.");
			break;
		
		default : 
			System.out.println("Choose from the above given option ");
		// no need to put break in defualt case 
		}

	}

}
