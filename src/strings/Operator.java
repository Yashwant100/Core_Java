package strings;

import java.util.ArrayList;

public class Operator {

	public static void main(String[] args) {
		// + opoerator is used to concatenate the String also convert the rest of data to String 
		System.out.println("Yash"+"Want");
		System.out.println("YAsh"+54);
		System.out.println("Jawahar"+new ArrayList<>());// new ArrayList() internally calls to.String method to give String representation of ArrayList()
		System.out.println("Nehru"+new Integer(56));
		//System.out.println(new Integer(56)+new ArrayList()); // it wil give you error we can use it with String Objects one of them should be String

	}

}
