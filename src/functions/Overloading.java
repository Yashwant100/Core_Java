package functions;

public class Overloading {

	public static void main(String[] args) {
		// Program to illustrate Method overloading
		System.out.println(sum(3,6,9));
		System.out.println(sum("Yashwant"));
		System.out.println(sum(5,7));

	}
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	static String sum(String name) {
		return "Hello "+name;
	}

}
/*
 *Method Overloading : Java allows multiple method with the same name creating compile time polymorphism and the 
 *                    method will differ by number of arguments, type of arguments and order of arguments. */
 