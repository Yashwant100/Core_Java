package functions;

public class ShadowingDemo {

	static int x=90; //this will be shadowed at line 10
	public static void main(String[] args) {
		// Program to illustrate shadowing concept
		System.out.println(x);
		int x = 40;
		System.out.println(x);
		fun();

	}
	static void fun() {
		System.out.println(x);
	}

}
/*
 * Shadowing : Shadowing happens when two variables uses same name but exist in different scope and the inner scope 
 *             temporarily hides the outer variable.
 */
 