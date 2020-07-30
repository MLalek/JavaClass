package questions;

import java.util.Scanner;

public class Q08 {
	//Write a Java program and compute the sum of the digits of an integer. 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = sc.nextInt();
		
	        int sum=0;
			 while (n != 0) {
		            sum += n % 10;
		            System.out.println(n);
		            n /= 10;
		            //System.out.println(n);
		        }
			
			
	         System.out.print(sum);//120
	         
	         
	         
	         sc.close();

	    }
	

	}


