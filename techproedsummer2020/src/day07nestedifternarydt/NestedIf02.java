package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		/*
		 *Type java code by using nested if statement,
If a number is even then check if it is divisible by 3 or not. 
If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
If the number is odd then check if it is divisible by 3 or not. 
If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.”
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = sc.nextInt();
		
		if (num %2 == 0) {
			
			if(num%3==0) {
				System.out.println("Perfect even numer");
			}else {
				System.out.println("Good even number");
			}
			// burada else if kullanmay gerek yok 
			// bu else if (num%2 !=0) bu zaten yukarda cift sayi bu ise tek sayi
		}else  {
			if(num%3==0) {
				System.out.println("Perfect odd number");
			}else {
				System.out.println("Good odd number");
			   }
		    }
		sc.close();
	}	
		
}
	
			
		
			
	


