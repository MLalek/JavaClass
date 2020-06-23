package day17constructorsmethodcreationdt;

public class MethodCreation03 {

	public static void main(String[] args) {
		
	}
	/*
	 If you create two methods whose names and parameters are same you will get CTE
	 To fix that problem
	 1)You can change the names but sometimes we need the methods whose names are same.
	 Because of that changing parameters
	 2) The best solution is changing parameters
	 ==>To change parameters you increase or decrease the number of parameters
	 ==>Change the date type of parameters
	 ==> If the data types are different, change the order (yerlerini degistir)
	 
	 Note: Changing return type, changing access modifier, changing method body does not solve that problem
	 */
	
	
	public static void add() {
		System.out.println("Addition");	}
	
	public static void add(int x) {
		System.out.println();
	}
	
	public static void add( int x, boolean b) {
		
	}
	
	public static void add(boolean b, int x) {
		
	}
	

}
