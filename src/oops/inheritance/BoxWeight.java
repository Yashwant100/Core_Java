package oops.inheritance;

public class BoxWeight extends Box {
	double weight;
	 public BoxWeight() {
		 this.weight = -1;
	 }
	 
	 public BoxWeight(double l, double w, double h, double we) {
		 super(l,h,w); // calling parent class constructor to initialize the properties of parent class.
		 this.weight = we;
	 }

}
// note : we can access the properties of parent clas but we cant acces the properties of child class through the parent obj.
