package day18statickeyworddt;

public class StaticKeyword01 {

	static int i = 12; // static variable ==> class variable
	int k = 13; //non-static variable ==> object variable == instance variable
	
	public static void main(String[] args) {
		//Number of non-static variables are equal to the number of 
		//objects which you created
		
		//Static variables are attached to the class because of that other name
		//of the static variables
		
		//Non-static variables(instance variables) are attached to objects because
		//of that their other name is "object variable"
		
		//If you want to access to a static variable you do not need to create an object
		//If you want to access to a non-static variable you have to create an object

	}
	
	public void increment() {
		i++;
		k++;
	}

}
