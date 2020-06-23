package day04operatorsifstatementdt;

import java.util.Scanner;

public class HwRectangleOfSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a value for the lenght and the width");
		
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		
		if (width == length) {
			System.out.println("Square");
		}else {
			System.out.println("Rectangle");
		}
		
		scan.close();

	}

}
