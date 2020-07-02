package day25stringbuildersdt;

public class StringVuilder01 {

	public static void main(String[] args) {
		// Java orjinale dokunmadan degisen yeniyi ekliyor. Java kaliyor yen's' JavaX oluyor.
		//Javax does not kill Java
		
		String str = "Java";
		join(str);
	}
	
	
	public static String join(String str) {
		return str + "X";
	}

}
