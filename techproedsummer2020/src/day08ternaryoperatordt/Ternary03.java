package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary and if-else.
		  Ask user to enter two integers
		  Write a program to print the minimum one on the console.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		//Ternary
		
		int result = a<=b ? a: b;
		System.out.println(result);
		
		sc.close();
		
	}

}
