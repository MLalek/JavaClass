package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter gender and age.
		 If the gender is "male" and the age is less than 20 print"Boy" 
		 otherwise print "Man" on the console.
		 If the gender is "female" and the age is less than 20 print "Girl"
		 otherwise print "Woman" on the console. 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls. enter your gender");
		//If you want to convert all characters in a String to lowercase use toLowerCase()
		//and besides do not forget to write your code in lowercase as "male"
		//toUpperCase makes strin uppercase  
		//1.way String gender = sc.next().toLowerCase(); 
		
		//2.Way:This commen way 
		//It if (gender.equalsIgnoreCase("male")) 
		
		String gender = sc.next(); 
		System.out.println("Pls. enter your age");
		int age = sc.nextInt();
		
		if (gender.equalsIgnoreCase("male")){
			if(age<20) {
				System.out.println("Boy");
			}else {
				System.out.println("Man");
			}
			
		}else if (gender.equals("female")) {
			if(age<20) {
				System.out.println("Girl");
			}else {
				System.out.println("Woman");
			}
			
		}else {
			System.out.println("undefined gender");
		}
		
		sc.close();

	}

}
