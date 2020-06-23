package day03scannerincrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Step
		//Instead of "red underline" tell "Java is complaining" or
		//"Compile Time Error"
		Scanner scan = new Scanner(System.in);
		
		//2.Step
		System.out.println("Please, give me your full name");
		
		//3.Step
		//If you use next(), Java will return only the first string
		//If you use nextLine(), Java will return all string
		String fullName = scan.nextLine();
		System.out.println(fullName);
		scan.close();

	}

}
