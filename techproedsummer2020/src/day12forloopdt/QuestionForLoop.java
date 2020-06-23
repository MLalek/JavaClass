package day12forloopdt;

import java.util.Scanner;

public class QuestionForLoop {

	public static void main(String[] args) {
		/* Interview Question
		 Ask user to enter a String
		 Type java code to print the String reverse on the console
		 For example; for "Germany" output will be "ynamreG"
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		sc.close();

	}

}
