package day_07;

public interface FlyingObjects {
	String name = "Boing 747";
    //Airplane, Helicopter, Kite, Drone, Balloon, ...They can all fly
	
	//Normally all methods are abstract by default
	//if we use default or static method are possible
	//After Java 8 default and static method are possible
	//Bu 3 kullanimi var
	
	void fly();
	
	default void takingoff() {		
	}
	static void landing() {		
	}
	/*
	 1. All of the methods are abstract by default (if we are not using default, static)
	 2. All methods are either abstract, default, static
	 3. Access modifiers are optional
	 4.Unlike abstraction, one class can implement more than one interface the same time
	 5.An interface can implement another interface
	 */
	
}
