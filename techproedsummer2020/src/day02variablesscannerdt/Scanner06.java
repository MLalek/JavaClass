package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the perimeter of a triangle whose
		 Side lengths are entered by user. (Use byte)
		 Hint 1: Perimeter of a triangle is a + b + c
		 Hint 4: To get byte, use nextByte()
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter lengths of triangle");
		
		byte lengthA = scan.nextByte();
		byte lengthB = scan.nextByte();
		byte lengthC = scan.nextByte();
		System.out.println("The perimeter:" +(lengthA + lengthB + lengthC));
		
		scan.close();
	}

}
