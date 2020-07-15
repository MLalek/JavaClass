package day32exceptionsdt;

public class E02 {
	
	static String s3; // static ise instance olamaz
	
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.length());//0==> length() returns the number of characters
										//	   in a String. s1 has no character so it is 0 	
 		
		String s2 = null;
		//System.out.println(s2.length());//If you try to get the length of "nul" object
										//you will get "NullPointerEception"
		
		//System.out.println(s3.length());//You will get "NulPointerException"
										//Because default value for Strings in JAva is "null"
//Note: 
	}

}
