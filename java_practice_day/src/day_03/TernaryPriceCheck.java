package day_03;

public class TernaryPriceCheck {
	
	public static void main(String[]args) {
		
		/*
		Write a code using ternary:
		Create int variable : price
		Create string variable : decision
		If the price = $10 Print “cheap”
		If price is 10-$20 print “ok” 
		Otherwise “expensive”.
		*/
		
		int price =11;
		String decision;
		
		if(price>=1&&price<=10) {
			decision="cheap";
			
		}else {
			if(price<=20) {
				decision="ok";
			}else {//price will be more than 20
				decision="expensive";
				
			}
		}
		System.out.println(decision);
		
		//Solving with Ternary
		
		String status=(price<=10)?"cheap" 
				:(price<=20)?"ok"
						:"expensive";
		System.out.println(status);		
		
		
		
	}

}
