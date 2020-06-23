package day05ifElseStatementdt;

import java.util.Scanner;

public class HomeworkQuestion02 {

	public static void main(String[] args) {
		/*
		 *Type java code by using if statement. When you enter the initial of the day of a week,
         output should be all possible names of the days.
         For example; if the initial is ’S’ output should be “Saturday or Sunday”
         
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial of a day in uppercase");
		//To get char from user have to use "nextLine().charAt(0)" 
		char initialOfDay = scan.nextLine().charAt(0);
		
		if (initialOfDay=='S') {
			System.out.println("Sunday of Saturday");
		}
		
		if (initialOfDay=='M') {
			System.out.println("Monday");
		}
		
		if (initialOfDay=='T') {
			System.out.println("Tueday of Thursday");
		}
		if (initialOfDay=='W') {
			System.out.println("Wednesday");
		}
		if (initialOfDay=='F') {
			System.out.println("Friday");
		}
		
				
		scan.close();
		
	}

}
