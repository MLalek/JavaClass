package Practice;

public class FirstLastCharsExchanged {

	/*
	 ilk ve son harflerin yer degistirmesi
	 Given a string, return a new string where the first and last chars have been exchanged.
	 */
	public static void main(String[] args) {
		String str = "MehmeT";
		
//		if (str.length() <=1) {
//			System.out.println(str);
//		}
		
		String mid = str.substring(1, str.length()-1);
		System.out.println(mid);//ehme
		
		System.out.println(str.charAt(str.length()-1) + mid + str.charAt(0)); //TehmeM  yani T + ehme + M
																			  	
	}

}
