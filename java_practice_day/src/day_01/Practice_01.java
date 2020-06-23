package day_01;

public class Practice_01 {

	// Every one shoul know to type main method
	public static void main(String[] args) {
		// public static=> access modifies. accessable from anywhere in the project.
		// Main method is always public static
		// main method name
		// void=> return type. Void=no special return type.
		// args =>argument
		// String[] = String of Array
		// What is main method
		// Engine of a car. Without main method, we cannot run any code.
		// Do we have to have a main method to build and run any code?
		// Yes we need main to build and run an application

		// How many data type are there in JAVA?
		// 2.Primetive and Non-primetive
		// How many primitive data type are there?
		// 8:boolean, char, byte, short, int, long, float, double
		// NOTE: all primitives start with lowercase

		// Please declare all the primitive data types?
		boolean b; // b =true
		// assign a value after
		b = false;
		boolean th = true;
		// In Java every character has a value. Space (bosluk) called whitespace.
		char c;
		c = 'a';
		byte by;
		short s;
		// int=> is Data Type, i=> variable(container), 1 =>value.
		// variables are important in JAVA.
		// Because, we create object/variable and use them in our codes to make our code
		// DYNAMIC
		// Also to use the same value again and again
		int i;
		long l;
		float f;
		double d;

		// print int
		// We have to initialize the variables ( int i = 1; i ye deger verme) to print
		// the values.
		System.out.println();
		// Find the minimum and maximum value of a short. Use the same variable s
		s = Short.MIN_VALUE;
		System.out.println("The Smallest Value of a short => " + s);
		s = Short.MAX_VALUE;
		// We are printing dynamically
		System.out.println("The Biggest Value of a short => " + s);
		//

	}

}
