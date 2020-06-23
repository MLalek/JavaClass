package day_02;

public class CharAtExmple {

	public static void main(String[] args) {
		//	
		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char ch1 = pickName.charAt(9);//J		
		char ch2 = pickName.charAt(0);//A
		char ch3 = pickName.charAt(21);//V
		//char ch4 = pickName.charAt(0);//A Aslinda bunun kullanmamasi daha iyi fazla data
		//char ch4=ch2;// Boyle de olur
		
		
		System.out.println(ch1+" "+ch2+" "+ch3+" "+ch2);
		
		//Printing JAVA without space using the same char variable
		System.out.println(ch1+ch2+ch3+ch2);//290 because JAva gives ASCII numbers
		//We might get incorrect string if we do not use "" or string at the
		//very beginning of the concatenation, then we can get incorrect result
		
		//Due to the ASCII CALCULATION
		System.out.println(""+ch1+ch2+ch3+ch2);//JAVA
		System.out.println(ch1+""+ch2+ch3+ch2);//JAVA
		System.out.println(ch1+ch2+ch3+""+ch2);//225A 	

	}

}
