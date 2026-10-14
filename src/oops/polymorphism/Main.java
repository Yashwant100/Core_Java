package oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s1 = new Shapes();
		Circle c1 = new Circle();
		Square sq1 = new Square();
		Shapes sq2 = new Square();// here refrence variable is of parent class but object is of child hence it will call depend on object
		
		
		s1.area();
		sq1.area();
		sq2.area();

	}

}
