package day11stringmethodsdt;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[]args) {
		
		/* 1)
		 Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
        If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
		 and print it on the console.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter an integer");
//		int a = sc.nextInt();
//		
//		if (a<0) {
//			System.out.println(a);
//		}else if (a<10 ){
//			System.out.println("It's square: "+a*a);
//		}else {
//			System.out.println(2*a);
//		}
		
		/* 2)
		 Ask user to enter his kid’s name, if the name contains “a” output will be 
		 “This name contains ‘a’.” if the name contains “z” output will be “This name 
		 contains ‘z’.” Otherwise, output will be “This name contains neither ‘a’ nor ‘z’.”
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your kid's name");
//		String ch = sc.next();
//		
//		if(ch.contains("a")) {
//			System.out.println("This name contains 'a'.");
//		}else if(ch.contains("z")) {
//			System.out.println("This name contains 'z'.");
//		}else {
//			System.out.println("This name contains neither 'a' nor 'z'.");
//		}
		
		// 3)
		// 	 Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
		//  If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
		//  “Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
		// If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a letter");
//		char ch = sc.next().charAt(0);
//		
//		if(ch>='A' && ch<='Z') {
//			if(ch<'F') {
//				System.out.println("Big before F");
//			}else {
//				System.out.println("Big after or on F");
//			}
//		}else if(ch>='a' && ch<='z') {
//			if(ch<'h') {
//				System.out.println("Smal before h");
//			}else {
//				System.out.println("Small after or on h");
//			}
//			
//		}else {
//			System.out.println("Please write just a letter");
//		}
		
		
		/*4)
		 Ask user to enter his/her first and last name. If the first name is longer 
		 output will be “First name is longer.” If the length of last name is equal
		 To the length of last name output will be “First name and last name
		 have same length.” Otherwise, output will be “Last name is longer”
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your first and then last name");
//		String fname = sc.nextLine();
//		String lname = sc.nextLine();
//		
//		
//		if(fname.length()>lname.length()) {
//			System.out.println("First name is longer");
//		}else if(lname.length()== fname.length()) {
//			System.out.println("First name and last name has same length");
//		}else {
//			System.out.println("Last name is longer");
//		}
		
		
		/* 5)
		  Ask user to enter a word which has 4 letters and output will be inverse of the word.
          For example; if user enters “MARK” output will be “KRAM”
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a word whic has 4 characters");
//		String str = sc.nextLine();
//		
//		char ch4 = str.charAt(3);
//		char ch3 = str.charAt(2);
//		char ch2 = str.charAt(1);
//		char ch1 = str.charAt(0);
//		
//		System.out.println("" + ch4 + ch3 + ch2 + ch1);//KRAM
		
		/* 6)
		 Ask user to enter a String and output will be the number of the characters in the String.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String");
//		String str = sc.nextLine();
//		System.out.println(str.length());
 
		/* 7)
		 Ask user to enter password, if the password is okay for the following conditions
		 output will be “Your password is created successfully.” If the password is not okay 
		 for any of the following conditions Output will be “Enter a new password according to the give conditions”
		 1.First letter must be uppercase
		 2.Last letter must be lowercase
		 3.Password must contain 6 characters
		 */
				
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your password");
//		String password = sc.next();
//		
//		if(password.charAt(0)>='A' && password.charAt(0)<='Z') {
//			}
//		if(password.length()-1>='a' && password.length()-1<='z') {
//			}
//		if(password.length()==6) {
//			System.out.println("Your password is created successfully");
//		}
//		else {
//			System.out.println("Enter a new password according to the given conditions");
//			
//		}
		
		
		/*8)
		 *  Ask user to enter his/her first name, last name and Social Security
		 * Number. Then type a program which makes a) initials of the first name and the
		 * last name in uppercase, other characters will be in lowercase. b) all
		 * characters except last 4 characters of the Social Security Number “ * ”. For
		 * example; Suleyman Alptekin *****5678
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String firstName = scan.next();
		
		System.out.println("Enter your last name:");
		String lastName = scan.next();
		
		System.out.println("Enter your SSN:");
		String ssn = scan.next();
		
		String initialFirstName = firstName.substring(0, 1).toUpperCase();
		System.out.println(initialFirstName);//M ==> mehmet yazdim sadece ilk harfini aldi
		String othersInFirstName = firstName.substring(1).toLowerCase();
		System.out.println(othersInFirstName);//ehmet birinciharfi 0 almayip 1 ve 1 den sonrasini veriyor
		String correctedFirstName = initialFirstName + othersInFirstName;
		System.out.println(correctedFirstName);//Mehmet  yukardaki iki islemin sonucunu + olarak veriyor
		
		
		String initialLastName = lastName.substring(0, 1).toUpperCase();
		String othersInLastName = lastName.substring(1).toLowerCase();	
		String correctedLastName = initialLastName + othersInLastName;
		System.out.println(correctedFirstName + " " + correctedLastName);
	
		String asterix = "*****"; //bu kac tane ise o kadar asterixi yaz
		String lastFourDigits = ssn.substring(5); //yazdigin 9 rakamli Ssn numarasinin 5 incisinden itibaren al (yani goster)
		String correctedSsn = asterix + lastFourDigits;//ilk 5 astrix + son 4 rakami (substring(5)) topliyor
		System.out.println(correctedSsn);
		
		scan.close();
		

		
		
	}
}
