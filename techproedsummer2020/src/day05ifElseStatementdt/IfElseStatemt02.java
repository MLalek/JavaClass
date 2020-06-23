package day05ifElseStatementdt;

import java.util.Scanner;

public class IfElseStatemt02 {

	public static void main(String[] args) {
		//Ask user to give a char
		//If the char is the same with your initial of your first name
		//print "You got it!" on the console
		//otherwise print "Try again!" on the console
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a char in uppercase");
		
		char initial = scan.nextLine().charAt(0);
		
		if (initial=='M') {
			System.out.println("You got it");
		}else {
			System.out.println("Try again");
		}
		
		scan.close();

	}

}
