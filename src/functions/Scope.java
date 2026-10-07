package functions;

public class Scope {

	public static void main(String[] args) {
		// Program to illustarte scope of variable
		int a = 10;
		int b = 20;
		
		{
			int c = 30; // if i declare something inside this block that thing will be accessible within this block.
			System.out.println(c);
			a = 50; // we able to modify the value of a becuase a can be accessible throughout the whole "main" function
		}
		
		System.out.println(a);
		//System.out.println(c); // this will give me an error cuase it belong to block level we cannot use this oustide of block
		
		// Scoping inside loop
		for(int i=0; i<10;i++) {
			System.out.println(i); // we can access counter variable "i" inside the for loop only coz its scope is limited to the loop only
			
		}
		//System.out.println(i);// it will give us error unresolved scope

	}

}
