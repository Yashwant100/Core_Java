package strings;

public class FindDuplicateChracter {

	public static void main(String[] args) {
		// Program to find duplicate character in a string
		String str ="yashwant";
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length()-1;j++) {
				char ch1 = str.charAt(j);
				if(ch==ch1) {
					System.out.println("Duplicate character is :"+ch);
				}
			}
		}

	}

}
