package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Ask user to enter a number
		// If the number user entered is less than 10 print "Won!" on the console
		// otherwise ask user to enter a number again.
		
		Scanner sc = new Scanner(System.in);
		
		
		int i =1;
		
		do {
			System.out.println("Enter a number");
			i=sc.nextInt();
			
			
		}while(i>=10);
		System.out.println("Won!");
		
		sc.close();

	}

}
