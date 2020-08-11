package questions;

import java.util.Scanner;

public class CompareTwoNum {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Input first number");
	        int number1 = input.nextInt();
	        System.out.println("Input second number");
	        int number2 = input.nextInt();

	      
	     // Write your code here
	     
	     if(number1<number2)
	       System.out.println(number1 +" < "+ number2);
	      if(number1>number2)
	       System.out.println(number1 +" > "+ number2);
	      if(number1==number2)
	       System.out.println(number1 +" == "+ number2);
	     if(number1<=number2)
	       System.out.println(number1 +" <= "+ number2);
	     if(number1>=number2)
	       System.out.println(number1 +" >= "+ number2);
	     if(number1!=number2)
	       System.out.println(number1 +" != "+ number2);
	        
	     
//	     	if ( number1 == number2 )           
//	            System.out.printf( "%d == %d\n", number1, number2 );  
//	        if ( number1 != number2 )          
//	            System.out.printf( "%d != %d\n", number1, number2 );  
//	        if ( number1 < number2 )          
//	            System.out.printf( "%d < %d\n", number1, number2 );  
//	        if ( number1 > number2 )          
//	            System.out.printf( "%d > %d\n", number1, number2 );  
//	        if ( number1 <= number2 )          
//	            System.out.printf( "%d <= %d\n", number1, number2 );  
//	        if ( number1 >= number2 )          
//	            System.out.printf( "%d >= %d\n", number1, number2 ); 
	     
	     input.close();

}
}