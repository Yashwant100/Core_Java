package oops;

public class StaticBlock {
	static int a =4;
	static int b;
	
	// Static block will run once at the time of class loading only i.e means whenever the first object is being created
	
	static {
		System.out.println("I'm inside the static block");
		b = a*5;
	}

	public static void main(String[] args) {
		// Program to demonstrate the purpose of static block
		StaticBlock s1 = new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
		StaticBlock.b += 3;
		StaticBlock s2 = new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		

	}

}
