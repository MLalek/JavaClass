package day05ifElseStatementdt;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		//Ask user to give you an integer,
		//If the integer is less than 10, print "You won" on the console
		//Otherwise, print "You lost!" on the console
		//In if-else there is one condition. Therefore java checks one condition.
		//But if use double if, you will have two conditions to check.Therefore, we prefer to use if-else instead of double.
				
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me integer to play");
		int a = scan.nextInt();
		//1.way: Solve the question 
		if (a<10) {
			System.out.println("You won!");
		}else {
			System.out.println("You Lost!");
		}
		
		//over here 2 conditions checking  
		if (a<10) {
			System.out.println("You won!");
		}
		if (a>=10)
			System.out.println("You Lost!");
		
		scan.close();	
	}

}
