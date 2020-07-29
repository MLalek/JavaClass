package day_02;

import java.util.Scanner;

public class Operators {
	/*
	 There are  lines of numeric input:
	The first line has a double,  (the cost of the meal before tax and tip).
	The second line has an integer,  (the percentage of  being added as tip).
	The third line has an integer,  (the percentage of  being added as tax).
	*/
	
	 

	public static void main(String[] args) {
        
        double mealCost = 12.00;
    	int tipPercent = 20;
    	int taxPercent = 8;
        
      
        // Calculate Tax and Tip:
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tax + tip);
      
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

}
