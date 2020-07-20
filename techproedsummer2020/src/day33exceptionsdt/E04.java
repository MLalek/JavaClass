package day33exceptionsdt;

public class E04 {

	public static void main(String[] args) {

	
		
		try	{
			
		
/*
 Integer obj = new Integer(80); de yapsak olur, Object parent class of 
 String (main String)in o yuzden Object de olur (ikisinden biri olmali)
 */	
		Object obj = new Integer(80); //Burada Integer i kullanamayiz Stringle uyusmaz O yuzden Object kullaniyoruz 
		String s = (String) obj; //Explicit narrowing
	
	}catch(ClassCastException e){
		System.out.println(e);
	//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		}
	}
}

/*
Checked (Compile Time Exception): You have to handle
1)FileNotFoundException ==> Path + Existence of the file
2)IOException ==> read + write + close files

Unchecked (Run Time Exceptions)
3)ArithmeticException ==> Math rules for example dividing by 0
4)NullPointerException ==> length() for null 
5)ArrayIndexOutOfBoundsException ==> Using non-existing index for arrays
6)IllegalArgumentException ==> for logical errors for example negative numbers for age
7)ClassCastException ==> If you try to cast Object class to String class 
8)NumberFormatException ==> When you use parseInt() with a String which is not created by
 digits
 */