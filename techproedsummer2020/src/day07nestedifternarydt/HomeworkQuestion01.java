package day07nestedifternarydt;

import java.util.Scanner;

public class HomeworkQuestion01 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement.
        Write a program to check if a year is leap year or not.
		if the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int year = sc.nextInt();
		//check if year is divisible by 100
		if(year%100==0 && year%400==0) {
			System.out.println("Leap year");
		}else if(year%100!=0 && year%4==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not leap year");
		}

		sc.close();
	}

}
