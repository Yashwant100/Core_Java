package oops.access;

public class GetClassMethod {

	public static void main(String[] args) {
		// Program to demonstrate the use of getClass() method
		Main main = new Main();
		System.out.println(main.getClass().getName());

	}

}
// Note : And we cannot override the getClass() method
