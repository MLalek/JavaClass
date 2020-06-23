package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		
		int a = sc.nextInt();
		
		if (a>10) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
		
		
		//2. Way: Ue Ternary Operator to solve
		String result = a>10 ? "Good" : "Bad";
		System.out.println(result);
		
		sc.close();
		
	}

}
