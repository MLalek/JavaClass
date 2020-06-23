package day17constructorsmethodcreationdt;

import java.util.Scanner;

public class MethodCreation02 {
	
	public static void main (String[]args) {
		simpleCalculator();
		
	}
	
	/*
	 Create a method outside of the main method
         Ask user to enter two numbers
         Ask user which operation he wants to do
         Print the result after doing the operation which user asked
         Call the method from inside the main method
	 */
	
	public static void simpleCalculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		System.out.println("Select an operation among +, -, *, /");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
			case '+':
				System.out.println("The sum is" +(n1+n2));
				break;
			case '-':
				System.out.println("The difference is" +(n1-n2));
				break;
			case '*':
				System.out.println("The pruduct is " +(n1*n2));
				break;
			case '/':
				System.out.println("The division is " +(n1/n2));
				break;
			default:
				System.out.println("Select an operation among +, -, *, /");
				
				sc.close();
				
		}
		
		
		
		
	}
	
	
	
	
	

}
