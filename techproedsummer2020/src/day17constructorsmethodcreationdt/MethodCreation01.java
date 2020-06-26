package day17constructorsmethodcreationdt;

public class MethodCreation01 {

	public static void main(String[] args) {
		add();
		subtract(5,3);//If your method has parameters, when you call the method
					  //you have to use values for the parameters.
					  //Values for parameters are called "arguments" in Java
					  //In subtract(5,3) ==>"5" and "3" are arguments.
		
		//If the method is not printing the result on the console, you have to put
		//method call inside the System.out.println(multiply(2,3));//6
	}
	
	public static void add() { //this is a method from inside the main body
		System.out.println("Addition");		
	}
	
	public static void subtract(int x, int y) {
		System.out.println(x-y);
	}
	
	
	//If you use return type different from "void" you have to use "return"
	//keyword in the last line of the method body.
	//If you do not use "return" you will get CTE	
	public static int multiply(int x, int y) { //here is return type int therefore you should in the a last line "return"(return x*y;)
		return x*y;
	}
	
	
	
	
	
	

}
