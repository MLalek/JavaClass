package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String. If the String has 2 characters, 
		 output will be “It is valid for state abbreviations” Otherwise, 
		 output will be “It is not valid for state abbreviations”
		 */
		
		String name ="Jonathan";
		System.out.println(name.length());//8
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		String str = sc.nextLine().toUpperCase();
		System.out.println(str);//str will be in upper case every time because we used toUpperCase();

		String result = str.length()==2 ? 
		"Valid for state abbreviations" : "Not Valid for state abbreviations";
		System.out.println(result);
		
		sc.close();
	}

}
