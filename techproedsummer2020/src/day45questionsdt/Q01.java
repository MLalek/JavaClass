package day45questionsdt;

public class Q01 {
	/*
	 Sertification exems tarzi sorul ve cevaplari
	 */

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		if(++x > y++) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
		System.out.println("x=" + x +" y="+y);

	}

}
