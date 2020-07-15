package Practice;

public class AbsoluteDifference {
	
	/*
	 Given an int n, return the absolute difference between n and 21, (arasindaki farki bul)
	 except return double the absolute difference if n is over 21. (Eger n 21 den buyukse *2 yap)
	 */
	

	public static void main(String[] args) {
		int n = 22;
		if (n <= 21) {
		 System.out.println( 21 - n);
		  } else {
		    System.out.println((n - 21) * 2);
		  }

	}

}
