package oops;

public class StaticVsNon_Static {

	public static void main(String[] args) {
		// Program to illustrate the static and non static context 
		Greet.staticGreet();// Static methods and variables can be accessed directly without creating objects with ClassName only
		//Greet.normalGreet();// this will give us error becuase it is not static and connot be called with creating object

		Greet g1 = new Greet();
		g1.normalGreet();// we can call it using object only
	}

}
class Greet{
	public void normalGreet() {
		System.out.println("Hey, How are you ?");
	}
	
	public static void staticGreet() {
		System.out.println("Hey , i'm static greet and can be accesed directly.");
	}
}
