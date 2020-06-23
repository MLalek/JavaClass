package day_02;

import java.util.Scanner;

public class Reviews {

	public static void main(String[]args) {
		
//		Create a class : “MultiplicationWithIncrement”
//		Then assign two values : num1=1, num2=1
//		Then print the multiplication table using ‘increment’ 
//		Note: when you use ++ increment sign then it inreases by 1
//		Print The Following multiplication table:
//		========= 
//		1 X 1 = 1 
//		1 X 2 = 2 
//		1 X 3 =3 
//		1 X 4 = 4 
//		1 X 5 = 5 
//		1 X 6 = 6 
//		1 X 7 = 7 
//		1 X 8 = 8 
//		1 X 9 = 9 
//		1 X 10 = 10
//		=========
		
//		int a=1;
//		int b=1;
//		
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
//		System.out.println(a+" x "+b+" = "+(a*b++));
		
		 /* Create a class : “IfElseStatement” Print “Please enter your job title” create
		  a String variable named “jobTitle” and get the data from the user Use the
		 below test data to print the correct jobTitle. Example : if jobTitle is qa
		 then print “Your job title is Qualty Analyst” test data: qa then print
		 Quality Analyst dev then print Developer ba then print Business Analyst pm
		 then print Project Manager
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your job title");
//		String jobTitle = sc.next();
//		
//		String qa="Quality Analist";
//		String dev="Develeper";
//		String ba="Business Analyst";
//		String pm="Project MAnager";
//		
//		if(jobTitle.equalsIgnoreCase("qa")) {
//			System.out.println("My job title is "+qa);
//		}else if (jobTitle.equalsIgnoreCase("dev")) {
//			System.out.println("My job title is "+dev);
//		}else if (jobTitle.equalsIgnoreCase("ba")) {
//			System.out.println("My job title is "+ba);
//		}else if (jobTitle.equalsIgnoreCase("pm")) {
//			System.out.println("My job title is "+pm);
//		}else {
//			System.out.println("Pls. enter valid job tittle");
//		}
	
//		Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter your job title:");
//		
//		String jobTitle = scan.nextLine();
//		
//		if(jobTitle.equalsIgnoreCase("qa")){
//			System.out.println("Your job title is Quality Analyst");
//		}
//		else if(jobTitle.equalsIgnoreCase("dev")){
//			System.out.println("Your job title is Developer");
//		}
//		else if(jobTitle.equalsIgnoreCase("ba")){
//			System.out.println("Your job title is Business Analyst");
//		}
//		else if(jobTitle.equalsIgnoreCase("pm")){
//			System.out.println("Your job title is Project Manager");
//		}
//		else {
//			System.out.println("Please enter a valid job title");
//		}
		
		
//		Create a class : “IfElseStatement2”
//		Print “Please enter your operation”
//		Get one operation symbol from user
//		(Addition, Subtraction, Division, Multiplication)
//		Print “Please enter 2 numbers”
//		Get 2 double numbers form users
//		Example
//		if Addition, 7, 4 then print The sum of your operation 7 + 4 = 11

		Scanner input = new Scanner(System.in);
		System.out.println("“Please enter your operation”");
		String operator = input.next().toLowerCase();
		
		System.out.println("Plese enter 2 numbers");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		if (operator.equals ("addition") || operator.equals ("+")) {
			System.out.println("The sum of your operation "+a+" + "+b+" = "+(a+b));
		}else if(operator.equals("substruction") || operator.equals("-")) {
			System.out.println("The diffence of your operation "+a+" - "+b+" = "+(a-b));
		}else if(operator.equals("multiplication") || operator.equals("*")) {
			System.out.println("The product of your operation "+a+" * "+b+" = "+(a*b));
		}else if(operator.equals("quotiant") || operator.equals("/")) {
			System.out.println("The division of your operation "+a+" / "+b+" = "+(a/b));
		} else {
			System.out.println("The sum of your "+operator+" is not Valid. Try again");
		}
		
 }
	
}
