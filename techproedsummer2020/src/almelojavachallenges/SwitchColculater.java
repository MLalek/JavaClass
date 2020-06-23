package almelojavachallenges;

import java.util.Scanner;

public class SwitchColculater {


			public static void main(String[] args) {
				// T

				Scanner scan = new Scanner(System.in);
				System.out.println("Enter 2 digit");

				System.out.print("enter first number:");
				int num1 = scan.nextInt();
				System.out.print("enter second number:");
				int num2 = scan.nextInt();
				System.out.println("Choose the number 0 for exit ");
				System.out.println("Choose the number 1 for '+' ");
				System.out.println("Choose the number 2 for '-' ");
				System.out.println("Choose the number 3 for '*' ");
				System.out.println("Choose the number 4 for '/' ");
				System.out.println("Choose the number 5 for '%' ");
				System.out.print("Your choose:");

				int operator = scan.nextInt();

				switch (operator) {

				case 0:

					System.exit(0);

					break;
				case 1:
					System.out.println("result: " + (num1 + num2));
					break;
				case 2:
					System.out.println("result: " + (num1 - num2));
					break;
				case 3:
					System.out.println("result: " + (num1 * num2));
					break;
				case 4:
					System.out.println("result: " + (num1 / num2));
					break;
				case 5:

					if (num1 > num2) {
						System.out.println("result: " + (num1 % num2));
					} else {
						System.out.println("First number must be greater than seconod number");

//						

					}

					break;

				default: {
					System.out.println("");
				}
				}
				
				scan.close();

			}
		
	}

