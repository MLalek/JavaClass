package questions;

import java.util.Scanner;

public class TheLargestNumber {

			public static void main(String[] args) {
			 
			  Scanner in = new Scanner(System.in);
			   
			   int num1 = in.nextInt();
			   int num2 = in.nextInt();
			   int num3 = in.nextInt();
			   	
			
		        if (num1>num2 && num1>num3){
		         System.out.println("The greatest: "+num1);
		         }if (num2>num3 && num2>num1){
		         System.out.println("The greatest: "+num2);
		         }if(num3>num1 && num3>num2) {
		           System.out.println("The greatest: "+num3);
		         }
		         
		         in.close();
		}

}
