package strings;

public class StringComparison {

	public static void main(String[] args) {
		// PRogram to check whether the object are refering to same the variable
		String a = "Yashwant";
		String b = "Yashwant";
		
		// " == " Operator is used to check whether both the reference are pointed to the same object or not
		if(a == b) {
			System.out.println("Both are pointed to the same object.");
		}else {
			System.out.println("Both ref variable are pointed to the diff object");
		}

	}

}
