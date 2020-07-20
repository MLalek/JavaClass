package day32exceptionsdt;

public class Interview {
	/*
	 What is the difference between "final", "finally" and "finalize()"?
	 1)final: We can use final keyword or a) variables ==> Their values cannot be updated
	 	 								  b) method    ==> The both of final methods is
	 	 								  					in its final state, it mens you
	 	 								  					cannot update the body of the 
	 	 								  					final method.If you cannot update
	 	 								  					the body overriding is not meaningful.
	 	 								  					Because of that Java does not allow
	 	 								  					final methods
	 	 								  c) class     ==>	Final classes cannot be inherited
	 	 								  					It means a final class cannot be parent
	 	 								  					class or a final class cannot have child 
	 	 								  					classes
	 2)finally: We can use "finally" code block after try-catch block. It runs under every condition.
	 			For example; to cut the connection with the cloud we can use finally code block.
	 			
	 3)finalize(): We can use finalize() method to make the unused objects ready to be destroyed by 
	 			   Garbage Collector.
	 */

	
	
	public static void main(String[] args) {
		

	}

}
