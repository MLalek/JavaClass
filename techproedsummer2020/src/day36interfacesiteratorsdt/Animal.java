package day36interfacesiteratorsdt;

public interface Animal {
	
	void eat();
	
	
	/*
	Normally, we cannot create concrete methods in interfaces but we need it too much
	JAva gives us an option to do it by using "default" keyword like in the following 
	example. 
	 */	
	//A default method is unique to an instance of the class.
	default void drink() {
		System.out.println("Woow! concrete method in an interface");
	}
	
	//A staticmethod is unique to a class.
	static void run() {
		System.out.println("Woow! second way to create conctrete method in an interface");
	}
	/*
	 When you create concrete methods by using "default" or "static" keywords
	 it must override 
	 */

}
	