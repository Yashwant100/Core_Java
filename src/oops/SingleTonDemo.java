package oops;

public class SingleTonDemo {
	private static SingleTonDemo instance;
	private SingleTonDemo() {
		
	}
	
	public static SingleTonDemo getInstance() {
		// Check if the object already returned or not
		if(instance == null) {
			instance = new SingleTonDemo();
		}
		return instance;
	}

	public static void main(String[] args) {
		//Program to demonstrate the SingleTon Class
		SingleTonDemo s1 = new SingleTonDemo();
		SingleTonDemo s2 = new SingleTonDemo();
		SingleTonDemo s3 = new SingleTonDemo();
		
		// Above all the three refrences are pointed to the same object since it is Singleton class

	}

}
