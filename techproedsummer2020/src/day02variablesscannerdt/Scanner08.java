package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		/*
		 Type a program which converts the hours to seconds. Hours value will be
		entered by user. (Use long)
		Hint 1: second = hour x 60 x 60
		Hint 2: To get long, use nextLong()
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Plesase enter the hours");
		
		long seconds = scan.nextLong();
		System.out.println("The seconds: " + (seconds*60*60));
		
		scan.close();

	}

}
