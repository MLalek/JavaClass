package Practice;

public class missingChar  {
	
	/*
	 Kelime icerisinden harf cikarma
	 
	Given a non-empty string and an int n, return a new string where the char 
	at index n has been removed. The value of n will be a valid index of a char 
	in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
	 */

	public static void main(String[] args) {
		String str = "missingChar Der";		
		int n=5;
		
		String front = str.substring(0,n);//missi	
										  //n=5 ilk 4 harfi 0 dan baslayarak yazdir, 5(haric) geri kalani sil										  //sonuc missi
		String back = str.substring(n+7);//missiDer 
										 // n= missi sonrasindan baslayarak 7(haric) indexi cikar ve sonrasini ekle

		System.out.println(front + back);
	}

}
