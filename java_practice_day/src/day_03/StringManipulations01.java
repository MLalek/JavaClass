package day_03;

import java.util.Scanner;

public class StringManipulations01 {

	public static void main(String[] args) {
		//ask user to enter an e-mail address 
		//then if it contains "hotmail" replace it with "gmail" 
		//e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a hotmail address");
		String hotmail=sc.next();
		
		//hotmail ==> gmail: replace g fot hot
		
		
		if(hotmail.contains("@hotmail")) {
			String gmail=hotmail.replace("@hotmail.com", "@gmail.com");//order is impor
			System.out.println(gmail);
		}else {
			System.out.println("You didn't enter a hotmail");
		}
		
//		Scanner scan = new Scanner(System.in);
//		String email = "ex@ex.com";
//		do {
//			System.out.println("Please, enter a hotmail email address.");
//			email = scan.nextLine();
//
//		} while (!email.contains("@hotmail.com"));
//		System.out.println(email.replace("hotmail.com", "gmail.com"));
//		
//		scan.close();

		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter an e-mail adress");
//		String str = scan.next();
//		
//		if(str.contains("hotmail")) {
//			System.out.println(str.replaceAll("hotmail", "gmail"));
//		}else {
//			System.out.println("You didn't enter hotmail");
//			
//		}
//		scan.close();
//		
		sc.close();
	}

}
