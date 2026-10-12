package oops;

public class OopsDemo {

	public static void main(String[] args) {
		// Program to demonstrate the use of class and object
		Student stu1 = new Student();
		stu1.setName("Yashwant");
		stu1.setRollNo(12);
		stu1.setStandard("12th");
		
		System.out.println("Name of the student is :"+stu1.getName());
		stu1.greet();

	}

}
class Student{
	int rollNo;
	String name;
	String standard;
	
	Student(){
		System.out.println("inside default constructor");
	}
	Student(int rNo,String naam, String standard){
		this.rollNo = rNo;
		this.name = naam;
		this.standard = standard;
	}
	public void greet() {
		System.out.println("Hello, My name is :"+this.name);
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
}
