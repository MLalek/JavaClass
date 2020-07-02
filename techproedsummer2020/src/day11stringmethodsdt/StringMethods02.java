 package day11stringmethodsdt;

public class StringMethods02 {

	public static void main(String[] args) {
//		// 13) trim() method will delete the space characters from the
//		//        beginning and ending of the String
//		
//		String str = " Java  ";
//		//Before trim()
//		System.out.println(str.length());//7
//		
//		//After trim()
//		System.out.println(str.trim().length());//4
//		
//		//14 indexOf() method returns the index of 1st occurrence of the character
//		String s = "Java is easy";
//		System.out.println(s.indexOf('J'));//0
//		System.out.println(s.indexOf("a"));//1
//		//In indexOf() method you can use String and chars as parameters
//		
//		System.out.println(s.indexOf("is")); // It will return index i==>5
//		//If you look for index of multiple characters you will get
//		//the index of first characters
//		
//		System.out.println(s.indexOf('x'));
//		//-1 x is do not exist in the String	
//		
//		System.out.println(s.indexOf('a', 4));
//		// After the 4th index (inclusive) what is the index of
//		//first occurrence of 'a' ==>9
//		
//		System.out.println(s.indexOf('a', 3));//3
//		//After the 3th index(inclusive) what is the index of 
//	//first occurrence 'a' ==> 3
		
		//15) lastIndexOf() method will return the index of last occurrence
		//                  of a character
		String t = "Learn java learn";
		System.out.println(t.lastIndexOf('a'));//13
		System.out.println(t.lastIndexOf("ar")); //13, it returned the first index
		
		System.out.println(t.lastIndexOf('e', 5));// 1 
		//soru gelecek/ Son 5 karakteri kare icine al ilk e
		//5 i bulmak icin +1 yapiyoruz 
		
 
	}

}
