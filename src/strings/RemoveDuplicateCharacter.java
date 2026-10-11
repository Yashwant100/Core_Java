package strings;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// Program to remove duplicate character from String
		String str = "yashwant";
		String str1 = "";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(str1.indexOf(ch)==-1) {
				str1+=ch;
			}
			
		}
		
		System.out.println(str1);

	}

}
