package Practice;

public class NearHundred {
	
	/*
	 10 eksigi veya 10 fazlasini bul
	 Given an int n, return true if it is within 10 of 100 or 200. 
	 Note: Math.abs(num) computes the absolute value of a number.
	 */

	public static void main(String[] args) {
		int n = 201;
		
		System.out.println((n>=90 && n<=110)||(n>=190 && n<=210));

	}

}
