package strings;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		// Program to count no of vowels in a string
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to count no of vowels");
		String str1 = input.nextLine().toLowerCase();
		int vowel=0;
		int consonant=0;
		
		
		
		System.out.println("The no of vowels in String are :"+countVowels(str1));
		System.out.println("The no of consonant in string are : "+consonant);
	}
	static int countVowels(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch =='u' ) {
				count++;
			}
		}
		
		return count;
	}

}
