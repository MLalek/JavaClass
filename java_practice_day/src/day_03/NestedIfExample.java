package day_03;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {

//		ask user to enter 2 birth dates 
//		Get the year, months, and day as integer
//		then find the older person using Nested if statements
//  	IF year/ month/day are same Then print “Interesting. Same year, month, day”
//		Examples:
//		int birthYearOfYusuf=2002, birthMonthOfYusuf=11, birthDayOfYusuf=12, 
//		int birthYearOfMehmet=2002,birthMonthOfMehmet=11, birthDayOfMehmet=12;
//		Yusuf is Older
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter birth year of Yusuf");
		int birthYearOfYusuf=sc.nextInt();
		System.out.println("Enter birth month of Yusuf");
		int birthMonthOfYusuf=sc.nextInt();
		System.out.println("Enter birth day of Yusuf");
		int birthDayOfYusuf=sc.nextInt();
		
		System.out.println("Enter birth year of Mehmet");
		int birthYearOfMehmet=sc.nextInt();
		System.out.println("Enter birth month of Mehmet");
		int birthMonthOfMehmet=sc.nextInt();
		System.out.println("Enter birth day of Mehmet");
		int birthDayOfMehmet=sc.nextInt();
//		
//		//So far we got 6 data from user
//		//Now we will use if statement to check the different conditions
//		//LOGIC:We will compare years then months then years
//		
//		if (birthYearOfYusuf > birthYearOfMehmet) {
//			System.out.println("Mehmet is older");
//		}else if(birthYearOfYusuf<birthYearOfMehmet) {
//			System.out.println("Yusuf is oldur");
//		}else {//Same year
//			//We compared years.When years are same We have to compare the month
//			if (birthMonthOfYusuf > birthMonthOfMehmet) {
//				System.out.println("Mehmet is older");
//			}else if(birthMonthOfYusuf<birthMonthOfMehmet) {
//				System.out.println("Yusuf is oldur");
//			}else {//Same year and month
//				
//				if (birthDayOfYusuf > birthDayOfMehmet) {
//					System.out.println("Mehmet is older");
//				}else if(birthDayOfYusuf<birthDayOfMehmet) {
//					System.out.println("Yusuf is oldur");
//				}else {//Same year, month and day
//					
//					
//					
//				}
//				
//			}
//			
//		}
//		
		if (birthYearOfYusuf < birthYearOfMehmet) {
            System.out.println("Yusuf is older");
        } else if (birthMonthOfYusuf < birthMonthOfMehmet){
            System.out.println("Yusuf is older");
        } else if (birthDayOfYusuf < birthDayOfMehmet) {
            System.out.println("Yusuf is older");
        } else if (birthYearOfYusuf == birthYearOfMehmet &&
                birthMonthOfYusuf == birthMonthOfMehmet &&
                birthDayOfYusuf == birthDayOfMehmet) {
            System.out.println("Same Age");
        } else {    
        System.out.println("Mehmet is older");
        }
		
		sc.close();
		
		
			
	}

}
