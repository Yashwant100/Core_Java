package strings;

public class StringBasic {

	public static void main(String[] args) {
		// How to create Diff String object
		String str = new String("Yashwant");
		String str1 = new String("Saini");
		
		System.out.println("The name is :"+str+" "+str1);
		
		System.out.println(str==str1); // it will gives you false because the boject which is created by new operator 
		                               // are not created in String Pool
		System.out.println(str.equals(str1));// used to compare the value of String objects
		
		// charAt(index) method is used to access the character from the String Objects
		String str2 = new String("Yash");
		System.out.println(str2.toString());
		

	}

}
