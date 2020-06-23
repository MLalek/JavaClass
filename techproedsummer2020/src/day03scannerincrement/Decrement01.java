package day03scannerincrement;

public class Decrement01 {

	public static void main(String[] args) {
		// Decrement: To decrease the value of a variable
		
		int num = 10;
		System.out.println(num); //10
		
		//1.way
		num = num -3;		
		System.out.println(num); //7
		
		//2.way
		num -= 2;
		System.out.println(num);
		
		//3.way: To decrease by 1 use that way
		num --;
		System.out.println(num);
		
		int num1 = 12;
		System.out.println(num1);
		
		//To increase we can use multiplication as well
		//1.way
		num1 = num1 * 2;
		System.out.println(num1);//24
		
		//2.way
		num1*=3;//72
		
		//To decrease we can use devision as well
		//1.way
		num1=num1/6;
		System.out.println(num1);//12
		
		//2.way 
		num1/= 2;
		System.out.println(num1);
		
		
		
		

	}

}
