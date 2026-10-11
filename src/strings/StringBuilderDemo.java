package strings;

import java.util.Arrays;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// Program to demonstrate the use of StringBuilder class
		StringBuilder str = new StringBuilder();
		str.append("Yash");
		str.append("Saini");// using append() method we can add the string at the end of the existing ones.
		System.out.println(str);
		
		// Reverse the String
		System.out.println(str.reverse());
		
		// insert the string at specify location
		str.insert(4, " ");
		System.out.println(str);
		
		//used to replace the string
		str.replace(0, 4, "Yash");
		System.out.println(str);

		// used to delete the string
		str.delete(5, 10);
	    System.out.println(str);
	}

}
