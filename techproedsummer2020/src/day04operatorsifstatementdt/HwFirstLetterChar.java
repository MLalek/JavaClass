package day04operatorsifstatementdt;

import java.util.Scanner;

public class HwFirstLetterChar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the First lettre of the day");
		
		char initialOfDay = scan.nextLine().charAt(0);
		
		if (initialOfDay == 'S') {
			System.out.println("Sunday or Saturday");
		}		
		if (initialOfDay == 'M') {
			System.out.println("Monday");
		}		
		if (initialOfDay == 'T') {
			System.out.println("Tuesday of Tursday");
		}
		if (initialOfDay == 'W') {
			System.out.println("Wednesday");
		}
		if (initialOfDay == 'F') {
			System.out.println("Friday");
		}
		
		scan.close();
	}

}
