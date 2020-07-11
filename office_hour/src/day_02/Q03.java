package day_02;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
//		ask user to create a password
//		it should have at least 
//		1 special char !”#$%^’()*+-.,/
//		1 upper case
//		1 lowercase
//		1 digit
//		the length of password should be at least 8 characters
//		Check password and print if the password is ok or not
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = scan.next();
		String specialChars = "!”#$%^’()*+-.,/";
		boolean special = false;
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean digit = false;
		if (password.length() > 7) {
			for (int i = 0; i < password.length(); i++) {
				if (specialChars.contains(password.substring(i, i + 1))) {
					special = true;
					break;
				}
			}
			for (int i = 0; i < password.length(); i++) {
				if ((password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')) {
					upperCase = true;
					break;
				}
			}
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
					lowerCase = true;
					break;
				}
			}
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
					digit = true;
					break;
				}
			}
			}
		if (special && upperCase && lowerCase && digit) {
			System.out.println("Your password is OK!");
		} else {
			System.out.println("Your password does not provide requirments");
		}
		scan.close();
	}
	
}
