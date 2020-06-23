package day04operatorsifstatementdt;

import java.util.Scanner;

public class HwModulsAndRactangle {

	public static void main(String[] args) {
		/*
		 Type a program like;
         Ask user to enter two integer values, the first will be greater than the second.
         The remainder when you divide the first by the second will be the width,
		 and the sum of the two numbers will be the length of a rectangle.
		 Then calculate the area and the perimeter of the rectangle, and print them
		 on the console.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers which is the first grater then second");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = (num1/num2)*(num2+num1);
		
		
		System.out.println("The area: " + (num1/num2)*(num2+num1));
		System.out.println("The perimeter: " + 2 * num3);
		scan.close();

	}

}
