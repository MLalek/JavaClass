package day09nestedternerydt;

import java.util.Scanner;

public class Hw03Switch {
	
	public static void main(String[]args) {
		
		/*
		 Ask user to enter one of the ‘U’, ’S’, and ‘A’. 
		 Then type a program by using “switch statement” to print “United” for ‘U’
		 ”States” for ’S’, and “America” for ‘A’
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one of the obrivation letters U, S, A");
		char abrivation = sc.next().toUpperCase().charAt(0);
		
		switch(abrivation) {
		case'U':
			System.out.println("United");
			break;
		case'S':
			System.out.println("States");
			break;
		case'A':
			System.out.println("America");
			break;
			
		default:
			System.out.println("Pls. enter a valid letter");
			break;
			
		}
		sc.close();		
		
		
		
	}

}
