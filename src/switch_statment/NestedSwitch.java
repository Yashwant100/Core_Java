package switch_statment;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// Program to demonstrate the use of Nested Switch
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the EmpID and Department ID :");
		int empID = input.nextInt();
		String deptID = input.next();
		
		switch(empID) {
		case 1 : 
			System.out.println("EmpID is 1 : Yashwant");
			switch(deptID) {
			case "IT" :
				System.out.println("Yashwant belong to IT dept");
				break;
			}
			break;
		
		case 2 :
			System.out.println("EmpID is 2 : Shwarwan");
			switch(deptID) {
			case "KCC" : 
				System.out.println("Sharwan belongs to KCC");
				break;
			}
			break;
			
		case 3 :
			System.out.println("EmpID is 3 : Sandeep");
			switch(deptID) {
			case "HR" : 
				System.out.println("Sandeep belongs to HR");
				break;
			}
			break;
			
		case 4 : 
			System.out.println("EmpID is 4 : Rahul");
			switch(deptID) {
			case "Design" : 
				System.out.println("Sandeep belongs to Design");
				break;
			}
			break;
			
		case 5 : 
			System.out.println("EmpID is 5 : Manish");
			switch(deptID) {
			case "Management" : 
				System.out.println("Manish belongs to Management");
				break;
			}
			break;
			
		default : System.out.println("Please enter the valid empID!");
		}

	}

}
