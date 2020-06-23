package almelojavachallenges;

import java.util.Scanner;

public class IfElseIf01 {
	public static void main(String[] args) {
		// User give 4 integers and program will check them
		// write on the console big number.
		// 10 9 13 1
		Scanner sc = new Scanner(System.in);
		System.out.println("First integer:");
		int a = sc.nextInt();
		System.out.println("Second integer:");
		int b = sc.nextInt();
		System.out.println("Third integer:");
		int c = sc.nextInt();
		System.out.println("Fourth integer:");
		int d = sc.nextInt();

//		if (num1 > num2) {
//			if (num1 > num3) {
//				if (num1 > num4) {
//					System.out.println("Big number is : " + num1);
//				} else {
//					System.out.println("Big number is :" + num4);
//				}
//			} else if (num3 > num4) {
//				System.out.println("Big number is :" + num3);
//			} else {
//				System.out.println("Big number is :" + num4);
//			}
//
//		} else if (num2 > num3) {
//			if (num2 > num4) {
//				System.out.println("Big number is :" + num2);
//			} else {
//				System.out.println("Big number is :" + num4);
//			}
//		} else if (num3 > num4) {
//			System.out.println("Big number is :" + num3);
//		} else {
//			System.out.println("Big number is :" + num4);
//		}
//
//	}
		if (a > b && a > c  && a > d ) {
			System.out.println("big number  a: " + a);
		} else if (b > a && b > c  && b > d ) {
			System.out.println("big number  b: " + b);
			
		}else if (c > a && c > b  && c > d ) {
			System.out.println("big number  c: " + c);
		}else {
			System.out.println("big number  d: " + d);
		}
		sc.close();
	}

}
