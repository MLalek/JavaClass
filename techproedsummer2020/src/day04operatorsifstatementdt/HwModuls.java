package day04operatorsifstatementdt;

import java.util.Scanner;

public class HwModuls {

	public static void main(String[] args) {
		//Ask user to enter a 4 digits integer, then print the sum of the first
		//and the last digit of the number on console.
		//For example; if user enters 1234 you will add 1 and 4,
		//then print on the console 5
		//Not:int tek bir sayi (4 haneli) oldugu icin tek verdik. 
		//Birden fazla sayi isteseydik o zaman a, b, c vs baska bir sey olurdu.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me 4 integers");
		int a = scan.nextInt(); 
		
		int lastDigit = a %10;
		int firstDigit = a / 1000;
		
		System.out.println("The sum of the firt and last digits: " + (lastDigit+firstDigit));
		
		scan.close();
		
		

	}

}
