package day_02;

import java.util.Scanner;

public class IfElseStatement2 {

	public static void main(String[] args) {
		
//	Create a class : “IfElseStatement2”
//	Print “Please enter your operation”
//	Get one operation symbol from user
//	(Addition, Subtraction, Division, Multiplication)
//	Print “Please enter 2 numbers”
//	Get 2 double numbers form users
//	Example
//	if Addition, 7, 4 then print The sum of your operation 7 + 4 = 11
		 
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your operation");
		String operation=input.next();
		
		System.out.println("Please enter 2 numbers");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		if(operation.equalsIgnoreCase("Addition")) {//addition, ADDITION, AdDITION
			System.out.println("The sum of your operation "+num1+" + "+num2+" = "+(num1+num2));
		}else if(operation.equalsIgnoreCase("Subtruction")) {
			System.out.println("The diffence of your operation "+num1+" - "+num2+" = "+(num1-num2));
		}else if(operation.equalsIgnoreCase("Division")) {
			System.out.println("The quotiant of your operation "+num1+" / "+num2+" = "+(num1/num2));
		}else if(operation.equalsIgnoreCase("Multiplication")) {
			System.out.println("The product of your operation "+num1+" * "+num2+" = "+(num1*num2));
		}else {
			System.out.println("The "+operation+" is not Valid. Try again");
		}

		//What is difference between equals and equalsIgnoreCase
//		String str1="Java";
//		String str2="JAVA";
//		System.out.println(str1.equals(str2));//false
//		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		input.close();
	}

}
