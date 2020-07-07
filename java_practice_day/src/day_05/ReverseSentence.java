package day_05;

public class ReverseSentence {
	/*
	 !Create a method: reverseString
	!It should accept a string sentences
	! And return the reverse of that string sentences.
	! E.g:
	!String str ="I love Java"; !Output:"Java love I”
	 */

	public static void main(String[] args) {
		String str = "I love Java";
		System.out.println(reverseString(str));
		
	}
	//A method can be void ot have a return type (String, int, double, char)
	//If a method has a return type, Then that method Must have return keyword at the end!
	public static String reverseString(String sentence) {
		String reversed="";
		//split
		String[] splitted=sentence.split(" ");// [I, love, Java]
        					// splitted[0] splitted[1] splitted[length-1]

		
		for (int i= splitted.length-1; i>=0; i--) {
			reversed+=splitted[i]+" ";
		}
		
		return reversed; //I always have to have return because this method is not void
	}
	
	
	
	
	
	
	
	
	

}
