package day20arraysdt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//How to check if a specific element is in the array		
		int arr [] = {1,5,4,3,5};
		
		/*
		 Note: 1) Before using binarySearch() method you have to use sort()
		          otherwise binarySearch() sometimes returns correct index
		          sometimes returns wrong index
		       2) binarySearch() method returns the index of element which you
		          are looking for
		       3) If you look for a non-existing element in an Array you will
		          get a negative number. "-" means not exist, the number 
		          the displays the number of the element if the element is exist     		 
		 */
		
		
		Arrays.sort(arr);//{2,3,4,5,5}
		System.out.println(arr);
		System.out.println(Arrays.binarySearch(arr, 4));//2
		System.out.println(Arrays.binarySearch(arr, 5));//3
		System.out.println(Arrays.binarySearch(arr, 2));//-2
		System.out.println(Arrays.binarySearch(arr, 0));//-1
	}

}
