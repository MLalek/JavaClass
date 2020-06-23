package day09nestedternerydt;

import java.util.Scanner;

public class Hw02Switch {
	
	public static void main(String[]args) {
		
		
		/*
		 Type java code by using switch statement.
		 A school has following rules for grading system:
		 1. For 50 - C 2. For 80 - B. 4. For 100 - A
		 Ask user to enter marks and print the corresponding grade.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mark among 50, 80, 100");
		int mark = sc.nextInt();
		
		switch(mark) {
		case 50:
			System.out.println("Your grade: C");
			break;
		case 80:
			System.out.println("Your grade: B");
			break;
		case 100:
			System.out.println("Your grade: A");
			break;

		default:
			System.out.println("Pls. give me a valid mark");
			break;
		
		}
		
		sc.close();
		
		
	}

}
