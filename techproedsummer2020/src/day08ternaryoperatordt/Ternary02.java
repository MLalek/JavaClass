package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 *Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		int a = sc.nextInt();
		
		if (a%2==0){
			System.out.println("The integer is even");
		}else {
			System.out.println("The integer is odd");
		}
		
		//2.way
		
		String result = a%2==0 ? "Even":"Odd";
		System.out.println(result);
		
		//Alternative way1:
		System.out.println(a%2==0 ? "Even":"Odd");
		
		sc.close();
		

	}

}
