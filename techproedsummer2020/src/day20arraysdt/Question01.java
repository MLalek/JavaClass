package day20arraysdt;

import java.util.Arrays;

public class Question01 {

	public static void main(String[] args) {
		/*
		 If an element does not exist in array 
		 1) Find the index of the element if it exists
		 2) Increase the index by 1
		 3) Change the sign to negative
		 */
		
		int num[] = {10, 2, 4, 6, 8};
		
		Arrays.sort(num);
		System.out.println(Arrays.binarySearch(num, 3));

	}

}
