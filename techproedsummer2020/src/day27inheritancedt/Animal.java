package day27inheritancedt;

public class Animal {
	
	public  boolean breathe = true;
	
	//private variables or methods cannot be inherited
	//Because private things cannot be access from other classes
	/*
	 Note 2: On the left super() keyword is not the first statement inside 
	 the constructor; therefore, you will get compile time error.
	 Note 3: super() and this() keywords cannot be in a constructor at the same time.
	 "super" and "this" keywords ==> can be in a constructor at the same time.
	 Note 4: super() and this() are used to call constructors.
     "super" and "this" are used to call ==> variables.
	 */
	private String type = "Animal";

	public static void main(String[] args) {
		
	}
	
	public void eat() {
		System.out.println("They eat");
	}
	
	public void drink() {
		System.out.println("They drink");
	}
	
	public void move( ) {
		System.out.println("They move");
	}
	
	
	
	
	
	
	

}
