package day04operatorsifstatementdt;

import java.util.Scanner;

public class HwIfStEvenOrOdd {

	public static void main(String[] args) {
		
		//Tek sayi ve cift sayi problemi
		//Type java code, if an integer is even, output will be “The integer is even”.
		//If the integer is odd, output will be “The integer is odd”.
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Give an even or odd integer");
				
				int a = scan.nextInt();
				
				//or if (a % 2 == 0) ... (a + " is even")
				
				if (a % 2 == 1) {
					System.out.println(a + " is odd");
				}else {
					System.out.println(a + " is even");
				}
				scan.close();
	}

}
