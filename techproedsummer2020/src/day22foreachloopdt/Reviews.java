package day22foreachloopdt;

import java.util.ArrayList;

public class Reviews {

	public static void main(String[] args) {
		
		//Create an integer array find the sum of all elements by using for-each loop
		//and print the sum on the console.
		int sum=0;
		int mda[] = {1,2,3,4,5};
		for(Integer w : mda) {
			sum = sum + w;
		}
		System.out.println(sum);//15
		
		
		//Create a list find the sum of all elements by using for-each loop
		//and print the sum on the console.
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		int sum1 = 0;
		for(Integer w: list) {
			//System.out.print(sum1 + " ");// 0 3 8 15
			sum1 = sum1 + w;
			//System.out.print(sum1+ " "); //3 8 15 24 
		}
		System.out.println(sum1); // 24
		
	
		
		//Write a Java program to find the common elements between two
		//arrays (string values).
		
		String 
		str1[] = {"aa", "BB", "cC"},
		str2[] = {"cC", "AA", "bb"};
		
		for(String s: str1) {
			for(String t: str2) {
				if(s==t) {
					System.out.println(s);
				}
			}
		}		

	}

}
