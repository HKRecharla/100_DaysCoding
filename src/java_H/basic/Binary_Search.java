package java_H.basic;

import java.util.Arrays;

public class Binary_Search {
	
	
	public static void main(String[] args) {
		
		
		
		int[] a = {1,2,3,3,4,4,20};
		
		
		Arrays.sort(a);
		int key =200;
		int res = Arrays.binarySearch(a, key);
		
		
		
		System.out.println("key size==> "+res);
	}

}
