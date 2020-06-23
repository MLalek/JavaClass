package day06ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*Ask user to give 2 integer
		 Type java code by using if-else if() statement,
        if both of the two integers are positive, output will be the sum of them.
        If both of the two integers are negative, output will be the multiplication of them.
        Otherwise; output will be “I cannot add or multiply different signed numbers”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Give me 2 integers");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a>0 && b>0) {
			System.out.println(a+b);
		}else if (a<0 && b<0){
			System.out.println(a*b);			
		}else {
			System.out.println("I cannot add or multiply");
		}
		scan.close();
	}

}
