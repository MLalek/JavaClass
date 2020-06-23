package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		/*
		 Type java code by using nested if() statement.
   		Ask user to enter a password
		If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
		“Valid Password” otherwise the output will be “Invalid Password”
		If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
		“Valid Password” otherwise the output will be “Invalid Password”
		 */

		
         //initial is single character
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a pasword");
			String password = sc.nextLine();
			
			char initial = password.charAt(0);
			
			//(initial>=65 && initial<=90) bu numaralari hatirlayamayacagimiz icin charakterleri kullanaliyiz.
			
			if(initial>='A' && initial<='Z') {
				if(initial =='A') {
					System.out.println("Valid pasword");
				}else {
					System.out.println("Invalid password");
				}
				
			}else if ( initial>='a' && initial<='z') {
				if(initial =='z') {
					System.out.println("Valid password");
				}else {
					System.out.println("Invalid password");
				}
				
			}else {
				System.out.println("Make the initial a letter");
			}
			sc.close();
				
	}

}
