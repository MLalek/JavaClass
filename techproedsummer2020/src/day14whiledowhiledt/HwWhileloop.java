package day14whiledowhiledt;

import java.util.Scanner;

public class HwWhileloop {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
		 Write a program to print numbers from 1 to 5.
		 */
		
//		int i=1;
//		while (i<=5) {
//			//i++;//2 3 4 5 6 
//			System.out.print(i+" ");
//			i++;//1 2 3 4 5 
//		}

		/*
		 Type java code by using while loop.
		 Write a program that types first 30 consecutive odd integers.
		 */
//		System.out.println("Consecutive odd numbers");
//		int a=1;
//		while(a<=30) {
//			
//			if(a%2==1) {				
//				System.out.print(a+" ");
//			}			
//			a++;
//		}
		
		/*
		 Type java code by using while loop, 
		 Write a program that prompts the user to input a positive integer. 
		 It should then print the multiplication table of that number.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = sc.nextInt();
		
		int b=1;
		
		while(b<=10) {
			
			System.out.println(num+" x "+b+ " = " + num*b);
			b++;
		}
		
		
		sc.close();
		
		
	}

}
