package day14whiledowhiledt;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*Interview Question
		 Type java code by using while loop,
		 Write a program that prompts the user to input an integer.
		 It should then find sum of the digits of that number.
		 352 sayisi ornegi uzerine
		 Not1: To get last digit every time use %10 /2 rakamina ulasiriz
		 Not2: To get second digit 352/10=35  then 35%10= 5 // ikinci sayimiz 5
		 Not3: 352/100=3.52 (java . dan sonrasini gormez), yani 3 bulduk  
		 ama bu son islemi de yapmaliyiz 3%10=3
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a posistive integer");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num!=0) {
			int lastDigit = num%10;
			num = num/10;
			sum = sum + lastDigit;			
		}
		System.out.println(sum);
		
		sc.close();
	}

}
