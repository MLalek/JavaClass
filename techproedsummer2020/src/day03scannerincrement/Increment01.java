package day03scannerincrement;

public class Increment01 {

	public static void main(String[] args) {
		//Incriment: To increase the value of a variable 
		
		int num1 = 10;
		System.out.println(num1); //10
		
		//1.way
		num1 = num1 + 5; // kisa yazmak lazim num1+=5; 
		System.out.println(num1); // 15
		
		// 2.way
		num1+=3;
		System.out.println(num1); //18
		
		//3.way
		num1++;//19
		System.out.println(num1);
		num1++;//20
		System.out.println(num1);
		

	}

}
