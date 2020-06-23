package day15dowhileloopdt;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her first name, last name and Social Security Number.
		  Then type a program which makes
		 a)initials of the first name and the last name in uppercase,
		 other characters will be in lowercase.b)all characters except last 4 characters
		  of the Social Security Number “ * ”.
		 For example; Suleyman Alptekin *****5678
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
