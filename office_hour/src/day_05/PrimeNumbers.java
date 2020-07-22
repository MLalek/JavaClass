package day_05;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {
	

//		Write a program that accepts an integer as input and 
//		prints first 10 prime numbers greater than input
//		Check numbers if they are even or not in a return method

//		1)way
//int input = 0;
//int count = 0;
//
//List<Integer> first10Primes = new ArrayList<>();
//
//while (count < 10) {
//	//if input is less than 1, it will start from the smallest prime to add list 
//	if (input < 1) {
//		input = 1;
//		//System.out.println(input); //1
//	}
//	input++;
//	System.out.print(input);//2345678910111213141516171819
//	// if statement checks the input, and adds 10 primes to the list.
//	if (isPrime(input)) {
//		count++;
//		first10Primes.add(input);
//	}
//	}
//	System.out.println(first10Primes);//[2, 3, 5, 7, 9, 11, 13, 15, 17, 19]
//	}
//	static boolean isPrime(int num) {
//	// if num is 2, then isPrime returns true, else if bigger than 2,
//	// then isPrime() checks the  number if prime is.
//	for (int i = 2; i < num; i++) {
//		if (num % 2 == 0) {
//			return false;
//		}
//	}
//	
//		return true;
		
		

//		2)way
		
//		Write a program that accepts an integer as input and 
//		prints first 10 prime numbers greater than input
//		Check numbers if they are even or not in a return method

		// Create variable for first 10
		int input = 0;
		
		//Call to method
		primeNumber(input);

	}
	
	//Create a method
	public static void primeNumber(int input) {
		
		int count=0;
		input++;
		// Check to first 10 prime numbers greater than input with loops
		for (int prime = input; count<10 ; prime++) {
			int n = 0;
			for (int j = 1; j <= prime; j++) {
				if (prime % j == 0) {
					n++;
					//System.out.print(prime);//122334445566667788889991010101011111212121212121313141414141515151516161616161717181818181818191920202020202021212121222222222323242424242424242425252526262626272727272828282828282929
				}
			}
			
			//Check the input with if statement, and add first 10 number after input
			if (n == 2) {

				System.out.print(prime + " ");
				input++;
				count++;
			}
		
	}

		
		
	}
	}
