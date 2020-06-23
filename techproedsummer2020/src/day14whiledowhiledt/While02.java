package day14whiledowhiledt;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
		 Write a program to count the factors of an integer which is entered by user.
		 
		 factor means "number of complete divisors" true
		 For example; 6==> 1, 2, 3, 6 ==> Print on the console 4
		 			  12==> 1,2,3,4,6,12 ==> Print on the console 6
		 			  5==> 1, 5 ==> Print on the console 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a posistive integer");
		int num = sc.nextInt();
		
		int i =1;
		int count = 0;
		while(i<=num) {
			if(num%i==0) {
				System.out.print(i + " ");
				count++;
			}
			i++;			
		}
		//System.out.println();
		System.out.println("\n"+count);
		
		sc.close();

	}

}
