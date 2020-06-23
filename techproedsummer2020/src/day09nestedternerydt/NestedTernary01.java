package day09nestedternerydt;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		
		/*
		Exmple Find the output for y = 8 and y = 12 and y = 4 and y = 5
		 (y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);
		 
		Example Find the output for name = “Ali” and name = “Veli”
		 (name.length() > 3) ? (name.contains(“i”) ? “Veli” : “No name”) : (“Ali”);
		 */
		
		/*
		 Type java code by using nested ternary.
		 Write a program to check if a year is leap year or not.
		 If the year is divisible by 100 then it must be divisible by 400.
		 If a year is not divisible by 100 then it must be divisible by 4.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a year");
		int year = sc.nextInt();
				
		String result = year%100==0 ? year%400==0 ? "Leap":"Not Leap":
			            year%4==0 ? "Leap": "Not Leap";
		
		System.out.println(result);
		sc.close();
	}

}
