package strings;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abccba";
		boolean result = isPalindrome(str);
		System.out.println("String is Palindrome : " + isPalindrome(str));

	}
	static boolean isPalindrome(String str1) {
		str1 = str1.toLowerCase();
		for(int i=0;i<str1.length()/2;i++) {
			char start = str1.charAt(i);
			char end = str1.charAt(str1.length()-1-i);
			if(start!=end) {
				return false;
			}
			
		}
		return true;
		}
			

}


