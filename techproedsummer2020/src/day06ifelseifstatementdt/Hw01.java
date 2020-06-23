package day06ifelseifstatementdt;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {

		/*
		  Ask user to enter his/her age. If the age is between 18 and 65 then output
		  will be “You should work”, else output will be “No need to work”
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age = sc.nextInt();
		
		if (age<18 || age>65 ) {
			System.out.println("No need to work ");
		} else {
			System.out.println("You should work");
		}
		sc.close();
		
	}

}
