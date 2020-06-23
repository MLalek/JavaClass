	package day04operatorsifstatementdt;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		 *Type java code by using if-else statement,
          if the password is “JavaLearner”, output will be “The password is true”.
          Otherwise, output will be “The password is false”.
		 */
		
		String password = "JavaLearner";
		
		//==is used only for primitives,  do not use == for Strings
		
		//if(password=="JavaLearner") Asagidakiyle ayni (password.equals ...)
		
		if (password.equals("JavaLearner")) {
			System.out.println("The password is true");
		}
		//(!) bu not equal demek
		if (!(password.equals("JavaLearner"))) {
			System.out.println("The password is false");
		}
		

		
		
	}

}
