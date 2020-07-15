package Practice;

import java.util.Scanner;

public class ParrotTrouble {
	
	/*
	 We have a loud talking parrot. The "hour" parameter is the current 
	 hour time in the range 0..23. We are in trouble if the parrot is talking
	 and the hour is before 7 or after 20. Return true if we are in trouble.
	 */

	public static void main(String[] args) {
		  //Extra yontem Console den saat vererek calistirma 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Give a time");
		  
		  int hour = sc.nextInt();
		  boolean talking = true;
		  System.out.println(talking && (hour<7 || hour>20));
		  
		  //1. Way
//		  boolean talking = true;
//		  int hour = 6;
//		  System.out.println(talking && (hour<7 || hour>20));
		  
		  //2.way
//		  if (talking && (hour>20 || hour<7)) {
//			  System.out.println(true); //papagan saat 7 ile 20 arasi konusursa true ver
//		  }else {
//			  System.out.println(false);
//		  }
		  
	}

}
