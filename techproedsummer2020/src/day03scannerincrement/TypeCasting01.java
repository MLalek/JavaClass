package day03scannerincrement;

public class TypeCasting01 {
 //TypeCasting is converting a data type to an other.It is called Typecasting, you are making typecasting
//It can from small to large. It is made by Java automaticly. Its name Auto Widening.
//It can from large to small Axplicit Narrowing:
	
	public static void main(String[] args) {
		// boolean char : not voor numbers
		// byte < short< int < long < float <double  
		
		//Auto Widening: To convert small data type to large data type.
		byte num1 = 112;
		short num2 = num1;
		System.out.println(num2);
		
		int num3 = 2345;
		double num4 = num3;
		
		//Explicit Narrowing: If you convert large data type to small
		//you have to type the name of the small data type before the variable name
		long num5 = 657;
		short num6 = (short) num5;
		
		double num7 = 12.56;
		float num8 = (float) num7;
		
		//Example
		short num9 = 255;
		byte num10 = (byte) num9;
		System.out.println(num10);
		
		//PDF slides03
		//Write a program to assign a value of 100.235 to a double variable
		// then convert it to int. Print it on the console.
		double num11 = 100.235;
		int num12 = (int) num11;
		System.out.println(num12);
		
		//Write a program to add an integer variable having value 5
		//and a double variable having value 6.2. Print the sum on the console.
		int num13 = 5;
		double num14 = 6.2;
		System.out.println(num13+num14);
		
		//Create an integer variable and increase it by 1, by using three different ways,
		//then type every result on the console.
		int num15 = 5;
		System.out.println(num15);
		num15 = num15 +1;
		System.out.println(num15);
		num15 +=1;
		System.out.println(num15);
		num15++;
		System.out.println(num15);
		
		//Create an integer variable and decrease it by 1, by using three different ways,
		//then type every result on the console.
		
		int num16 = 5;
		System.out.println(num16);
		num15 = num15 -1;
		System.out.println(num16);
		num15 -=1;
		System.out.println(num16);
		num15--;
		System.out.println(num16);
		
	

	}

}
