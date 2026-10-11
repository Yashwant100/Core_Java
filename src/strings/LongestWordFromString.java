package strings;

import java.util.Arrays;

public class LongestWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "india is my country";
		String[] words = str.split(" ");
		
		String longest = "";
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>longest.length()) {
				longest = words[i];
			}
		}

		System.out.println("Longest word :"+longest);
		System.out.println("Length of word :"+longest.length());
	}

}
