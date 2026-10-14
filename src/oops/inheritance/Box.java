package oops.inheritance;

public class Box {
	private double l;
	private double w;
	private double h;
	
	Box(){
		this.l = -1;
		this.w = -1;
		this.h = -1;
	}
	
	Box(double side){
		this.l = side;
		this.w = side;
		this.h = side;
	}
	
	Box(double le, double wi, double he){
		this.l = le;
		this.w = wi;
		this.h = he;
	}
	
	Box(Box old){
		this.l = old.l;
		this.w = old.w;
		this.h = old.h;
	}
	
	public void display() {
		System.out.println("Running the box");
	}

}
