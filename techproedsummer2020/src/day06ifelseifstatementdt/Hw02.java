package day06ifelseifstatementdt;

import java.util.Scanner;

public class Hw02 {
	public static void main(String[] args) {
		/*
		 Ask user to enter his/her age and gender. If the age is more than 65 and the
		 gender is male then output will be “Hey man you retired!” else output will be
		 “No need to work”
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls. enter your gender");
		
		String gender = sc.next();
		System.out.println("Pls. enter your age");
		int age = sc.nextInt();
		
		//(age>65 && gender== "male") Bu esitse ama asagidakinde buyuk hrle buile yazsan kabul eder
		
		if (age>65 && gender.equalsIgnoreCase ("male")) {
			System.out.println("Hey man you are retired");
		}else {
			System.out.println("What do you waiting for, You need to work");
		}
		
		sc.close();
		
	}

}
