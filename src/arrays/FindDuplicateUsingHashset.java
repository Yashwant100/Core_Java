package arrays;

import java.util.HashSet;

public class FindDuplicateUsingHashset {

	public static void main(String[] args) {
		// Finding duplicate from an array using HashSet
		int[] arr = {3,5,8,4,9,10,14,24,5};
		boolean flag = false;
		
		HashSet<Integer> lang = new HashSet<Integer>();
		
		for(Integer ar:arr) {
			if(lang.add(ar)==false) {
				System.out.println("Duplicate found :"+ar);
				flag = true;
			}
		}
		
		if(flag==false) {
			System.out.println("Duplicate not found");
		}

	}

}
