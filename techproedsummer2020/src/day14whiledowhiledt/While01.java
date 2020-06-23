package day14whiledowhiledt;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		/* Interview Question
		 * Type java code by using while loop,
		 * Write a program that prompts the user to input a positive integer.
		 * It should then print factorial of that number.
		 *        5 factorial(5!) = 1x2x3x4x5 5 e kadar carpanlari
		 *        factorial 10 olsaydi o zaman 10 a kadar cikacakti 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = sc.nextInt(); // user enters 5
		
		//1.way using for-loop
//		int product = 1;
//		for(int i=1; i<=num; i++) {
//			product = product * i;
//		}
//		System.out.println(product);//120 cikiyor
		
		//2.Way by using while loop
		int prdct =1;
		int i=1;
		while(i<=num) {
			prdct = prdct * i;
			i++;
			 System.out.print(prdct);//
		}
		
         //System.out.print(prdct);//120
         
         
         
         sc.close();

}
}
