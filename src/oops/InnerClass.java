package oops;

public class InnerClass {
	
	// Static inner class
	static class Test{
		String name;
		public Test(String nam) {
			this.name = nam;
		}
	}

	public static void main(String[] args) {
		// Program to demonstrate static inner class
		Test t1 = new Test("Yashwant");
		System.out.println("Name is :"+t1.name); // Class test is declared as static in context that's why we are able
		                                         // to access it with using outer class.
		
		

	}

}
// Note : Outside classes cannot be static only the inner classes can be the static