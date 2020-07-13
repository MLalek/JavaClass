package day_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DublicateNumbers {
	/*
     * Write a code that returns the duplicate numbers in an int array
     * e.g.
     * int nums[]={12,3,3,4,5,6,1,2,7,12,14,12,1,1,1};
     * Output: 1  3  12
     */

	public static void main(String[] args) {
		int nums[]= {12,7,3,3,4,5,6,7,8,1,2,4,12,14,1,1,10};
		//I will sort this array 
		Arrays.sort(nums); // sortla siralayacaz ve bir sonrakiyle karsilastirip ayni olandan bir tanesini alacaz
		//Creating List of Integer
		List<Integer> uniqueInteger=new ArrayList<>();
		
		for (int i = 0; i < nums.length-1; i++) {		
			//System.out.print(nums[i] +" ");//1 1 1 2 3 3 4 4 5 6 7 7 8 10 12 12 
			
			//
			if(nums[i]==nums[i+1] && !uniqueInteger.contains(nums[i])) {
				uniqueInteger.add(nums[i]);
			}
		}		
		System.out.println(uniqueInteger);//[1, 3, 4, 7, 12]
		for(Integer num:uniqueInteger) {
			System.out.print((num+" "));//1 3 4 7 12
		}
	}

}
