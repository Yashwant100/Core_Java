package oops;

public class CopyConstructor {

	public static void main(String[] args) {
		// Program to demonstrate the purpose of Copy constructor
		car c1 = new car();
		
		c1.engine="Dicor";
		c1.model = 2004;
		c1.wheels = 4;
		car c2 = new car(c1);
		c1.display();
		c2.display();
		

	}

}
class car{
	int model;
	String engine;
	int wheels;
	
	car(){
		System.out.println("Inside the default constructor.");
	}
	car(car other){
		this.model = other.model;
		this.engine = other.engine;
		this.wheels = other.wheels;
	}
	
	
	void display() {
		System.out.println("The model is :"+this.model+", the engine is :"+this.engine+" and the wheel is :"+this.wheels);
	}
}
