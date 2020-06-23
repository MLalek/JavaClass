package day04operatorsifstatementdt;

import java.util.Scanner;

public class HwWeekOrWeekendDay {

	public static void main(String[] args) {
		//Type java code by using if statement. When you enter the name of the day of a week,
		//output will be “Weekday” or “Weekend day” according to the name of the day.
		
		Scanner scan = new Scanner (System.in);
    	System.out.println("Enter a name of a day");
    	
    	
    	
    	//String dayOfWeek = "Monday"; Buradaki gunu degistirerek direk weekend veya weekdays cikar
		 
    	// scan.nextLine ozelligi console de gun yazmana yariyor 
    	String dayOfWeek = scan.nextLine(); 
		 
		 if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
			 System.out.println("Weekend");
		 }else {
			 System.out.println("Weekdays");
		 }
		 scan.close();

	}

}
