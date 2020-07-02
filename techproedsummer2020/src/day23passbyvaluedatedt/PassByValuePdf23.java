package day23passbyvaluedatedt;

public class PassByValuePdf23 {

	public static void main(String[] args) {
		double price = 100;
		
		discountForVeterans(price);
		discountForSeniors(price);
		System.out.println(price);
	}
	public static void discountForVeterans(double price) {
		price = price*0.80;
		System.out.println(price);
	}
	
	public static void discountForSeniors(double price) {
		price = price*0.90;
		System.out.println(price);
	}
	
	

}
