package Practice;

public class MonkeyTrouble {
	

	public static void main(String[] args) {
		/*
		 We have two monkeys, a and b, and the parameters aSmile and bSmile indicate 
		 if each is smiling. We are in trouble if they are both smiling or if neither 
		 of them is smiling. Return true if we are in trouble.

		monkeyTrouble(true, true)==>  true
		monkeyTrouble(false, false)==>  true
		monkeyTrouble(true, false)==> false
		 */
		
		boolean aSmile = true;
		boolean bSmile = false;
				
		  if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
			   System.out.println("Monkey has trouble");
			  }else {
				  
				  System.out.println("Monkey is normal");
			  }

	}

}
