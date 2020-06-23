package day_02;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		/*
			 * Create a class : “IfElseStatement” Print “Please enter your job title” create
			 * a String variable named “jobTitle” and get the data from the user Use the
			 * below test data to print the correct jobTitle. Example : if jobTitle is qa
			 * then print “Your job title is Qualty Analyst” test data: qa then print
			 * Quality Analyst dev then print Developer ba then print Business Analyst pm
			 * then print Project Manager
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your job title");
		String jobTitle = sc.next();
		
		//creating variables for different job titels for making it more donamic
		String qa="Quality Analyst";
		String dev="Developer";
		String ba="Business Analyst";
		String pm="Project Manager";

		if (jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Your job title is Qualty "+qa);
		}else if(jobTitle.toLowerCase().equals(dev)) {//dev zaten var Upper girerlerse lower yapiyor	
			System.out.println("Your job title is Qualty "+dev);
		}else if(jobTitle.equalsIgnoreCase("ba")) {	
			System.out.println("Your job title is Qualty "+ba);
		}else if(jobTitle.equalsIgnoreCase("dev")) {	
			System.out.println("Your job title is Qualty "+pm);
		}else {
			System.out.println("Heyy " +jobTitle + "is not Valid. Try Again!");
		}
		
		sc.close();

	}

}
