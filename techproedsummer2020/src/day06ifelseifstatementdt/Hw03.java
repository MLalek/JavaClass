package day06ifelseifstatementdt;

import java.util.Scanner;

public class Hw03 {
	
	public static void main(String[]args) {
		
		// Ask user to enter a character, then check whether the character is alphabet or not
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        
        char chr = scan.next().charAt(0);
        
        if((chr>='a' && chr<='z')||(chr>='A' && chr<='Z')) {
        System.out.println("The character is in alphabet");
    }else{
        System.out.println("The character is not in alphabet");
    }
		 scan.close();
		
	}

}
