package day09nestedternerydt;

import java.util.Scanner;

public class HwSxitch01 {

	public static void main (String[]args) {
		
		/*
		Write a Java program user will choose answer among A, B, C, or D.
		If the answer is true, output will be “True.” If the answer is false, output will be
		“False”. Correct answer is ‘C’ for the multiple option question.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your answer among A, B, C, D");
		char answer = sc.next().toUpperCase().charAt(0);
		
		switch(answer) {
		case 'A':
			System.out.println("False");
			break;
		case 'B':
			System.out.println("False");
			break;
		case 'C':
			System.out.println("True");
			break;
		case 'D':
			System.out.println("False");
			break;
				
		default:
			System.out.println("Pls. write one of the 4 choises");
		
		}
		
		sc.close();
	}
	
}
