package oops.access;

public class A {
	int num;
	String name;
	int[] arr;
	
	public A(int n, String naam) {
		this.num = n;
		this.name = naam;
		this.arr = new int[num];
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
