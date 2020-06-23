package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his first name
		 If the length of his first name is greater than 6 print "Long name"
		 otherwise print "Normal name" and finish the loop
		 */
		
		Scanner sc = new Scanner(System.in);
		String name ="";
	
		
		do {
			System.out.println("Enter your first name");
			name =sc.next();
			
			if(name.length()>6) {
				System.out.println("Long name");				
			}
		}while(name.length()>6);
		System.out.println("Normal name");
		
		sc.close();

	}

}
