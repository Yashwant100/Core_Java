package strings;

public class StringReverse {

	public static void main(String[] args) {
		// Program to check weather a String is palindrome or not
		String str = "madam";
		String rev = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("The string is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}

	}

}
