package strings;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
		// Program to check whether a String is Anagrams or not 
		String str1 = "listen";
		String str2 = "silent";
		
	    char[] a = str1.toLowerCase().toCharArray();
	    char[] b = str2.toLowerCase().toCharArray();
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    if(Arrays.equals(a,b)) {
	    	System.out.println("String are Anagrams");
	    }else {
	    	System.out.println("Strings are not anagrams");
	    }
	    

	}

}
