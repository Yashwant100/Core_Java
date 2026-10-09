package arrays;

public class FindDuplicateFromArray {

	public static void main(String[] args) {
		// Program to find duplicate element from an array
		//int[] arr = {2,34,65,78,4,1,9,4,2};
		String []arr = {"java","c","c++","java","python","c"};
		boolean flag = false;

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println("Found the duplicate :"+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false){
			System.out.println("No such duplicate element");
		}
		
	}

}
