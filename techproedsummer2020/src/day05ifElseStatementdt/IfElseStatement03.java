package day05ifElseStatementdt;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		//Ask user to give you the quantity of the products and the unit price of the product.
		//
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me quantity and the unit price");
		
		short quantity = scan.nextShort();
		short unitPrice = scan.nextShort();
		
		if (quantity>1000) {
			System.out.println("You got 10% discount:");
			System.out.println(0.9*unitPrice*quantity);
		}else {
			System.out.println("No discount");
			System.out.println(unitPrice*quantity);
			
			scan.close();
		}
	}

}
