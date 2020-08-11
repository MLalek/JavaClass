package questions;

import java.util.Scanner;

public class Q07 {
/*
 Write a Java program that takes five numbers as input to calculate and print the average of the numbers.
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give 5 integer");
		int num1 = in.nextInt();
	    int num2 = in.nextInt();
	    int num3 = in.nextInt();
	    int num4 = in.nextInt();
	    int num5 = in.nextInt();
	    
	System.out.println("average of the numbers = " +(num1+num2+num3+num4+num5)/5);

	in.close();
	}

}
