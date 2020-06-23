package day16constructorsdt;

public class Constructors01 {

	//When you create a constructor Java deletes the default one
	Constructors01(){ //first constructor
		
	}
	
	//Create a constructor which has 1 parameter	
	Constructors01(int price){ // second constructor
		
	}
	
	//Create a constructor which has 2 parameters
	Constructors01(boolean b, char ch){
		
	}
	
	//Create a constructor which has 2 parameters
	Constructors01(char ch, boolean b){
			
	}
	
	
	public static void main(String[] args) {
		
		//1) Constructors are used to create objects from Classes
		//2) Constructor is not method because; a) Constructors do not have return type
		//										b) Constructors name's starts with upper case
		//3) Constructor's name must be same with the class name but methods name may be same
		//   or different with the class name
		//4) Constructors should be inside the class body
		//5) When you create  class, Java creates a constructor for the class. The constructor
		//   is behind the class, it is invisible inside the class.
		//   The constructor which Java created is called "default constructor"
		//   Default constructors do not have any "parameters". I mean inside the default
		//   constructor parentheses there is no parameters 
		//6) When you create any constructor Java deletes the default one   
	    
		
		//  Do not forget: Classes for creating templates
		// Classes not enough for creating object we need constructor (Java always
		// use constructor behind which we do not see them) 
		
		//-------------To create an object---------
		//  Class name		Object name  	 new keyword	 	 Constructor
		  Constructors01     mehmet       = 	new  			Constructors01();
		 
		
	}
	public void add(int num1, int num2) {
		
	//add methods should have minimum 2 parameters
	//paramaters are num1, num2
	//datatypes of parameters are int (integer)
	}
	
 
}
