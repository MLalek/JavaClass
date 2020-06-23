package day_02;

import java.util.Scanner;

public class ScannerPractise {

	public static void main(String[] args) {
		//Creating Scanner Object
		
		Scanner scan = new Scanner(System.in);
		
		//String input
		System.out.println("Enter a string");
		String str=scan.nextLine();
		
		//using the scanner object we can get different type of data from user
		System.out.println("Enter an integer");
		int i = scan.nextInt();
		
		//double object
		System.out.println("Enter a double");
		double d=scan.nextDouble();
		
				
		// char input 
		System.out.println("Enter a char");
		char c=scan.next().charAt(0);
		
		scan.close();
		
		
	
	}

}
