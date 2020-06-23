package day02variablesscannerdt;

public class Variables01 {

	public static void main(String[] args) {
		//How to get min and max values of primitive data types
		//byte, short, int, long, float, double
		
		//I will find the min value (-128) of byte
		byte minValueOfByte = Byte.MIN_VALUE;
		System.out.println(minValueOfByte);//-128
		
		//Please find the max value of byte
		byte maxValueOfByte = Byte.MAX_VALUE;
		System.out.println(maxValueOfByte);//127
		
		//Please find min and max value of integer
		int minValueOfInt = Integer.MIN_VALUE;
		System.out.println(minValueOfInt);//-2,147,483,648
		
		int maxValueOfInt = Integer.MAX_VALUE;
		System.out.println(maxValueOfInt);//2147483647
		
		//Homework: Find Min and Max values of short, long, float, double
		short minValueOfShort = Short.MIN_VALUE;
		System.out.println(minValueOfShort);
		
		short maxValueOfShort = Short.MAX_VALUE;
		System.out.println(maxValueOfShort);
		
		long minValueOfLong = Long.MIN_VALUE;
		System.out.println(minValueOfLong);
		
		long maxValueOfLong = Long.MAX_VALUE;
		System.out.println(maxValueOfLong);
		
		float minValueOfFloat = Float.MIN_VALUE;
		System.out.println(minValueOfFloat);
		
		float maxValueOfFloat = Float.MAX_VALUE;
		System.out.println(maxValueOfFloat);
		
		double minValueOfDouble = Double.MIN_VALUE;
		System.out.println(minValueOfDouble);
		
		double maxValueOfDouble = Double.MAX_VALUE;
		System.out.println(maxValueOfDouble);

	}

}
