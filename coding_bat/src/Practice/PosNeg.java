package Practice;

public class PosNeg {
	

/*
 negative parametremiz her iki sayi eksi oldugund true olacak.Diger hallerde false
 Given 2 int values, return true if one is negative and one is positive.
 Except if the parameter "negative" is true, then return true only if both are negative. 
 */
		

	public static void main(String[] args) {
		int a = -1;
		int b = -1;
		boolean negative = true;
		if(negative) {
			System.out.println(a<0 && b<0);
		}else {
			System.out.println(a<0 && b>0 || a>0 && b<0);
		}

	}

}
