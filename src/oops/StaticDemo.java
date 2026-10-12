package oops;

public class StaticDemo {

	public static void main(String[] args) {
		// Object creation
		Human h1 = new Human();
		System.out.println(Human.population);
		Human h2 = new Human("Naveen", 15000, false);
		System.out.println(Human.population);

	}

}
class Human {
	String Name;
	int salary;
	boolean married;
	static  int population=0;
	
	public Human() {
		System.out.println("inside the default constructor!");
		this.Name = "Yashwant";
		this.salary = 50000;
		this.married = true;
		Human.population += 1; 
	}
	
	public Human(String nam, int sal, boolean marries) {
		System.out.println("inside the parametrized constructor!");
		this.Name = nam;
		this.salary = sal;
		this.married = marries;
		Human.population += 1;
	}
}
/*
 * Anything which is declared inside the class prefixes with keyword static that thing will belong to the class 
 * directly and will be shared among all the objects of the class.*/
