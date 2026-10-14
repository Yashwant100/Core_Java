package oops.access;

public class ObjectDemo {

	int num = 34;
	@Override
	public int hashCode(){
		return num;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public static void main(String[] args) {
		ObjectDemo obj = new ObjectDemo();
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass().getName());
		System.out.println(obj instanceof ObjectDemo);
	}
}
