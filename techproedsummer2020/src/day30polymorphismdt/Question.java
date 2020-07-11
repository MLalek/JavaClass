package day30polymorphismdt;

public class Question { //here we have overriding 

	public Integer add() {
		return 12;
	}
	
}

class Number extends Question{
	/*
	 When you use wrapper classes as return type in overriding
	 return types must be same otherwise you will get CTE.
	 We need IS-A relationship between the return types in overriding but 
	 for wrapper classes JAva did not create parent-child relationship because of that
	 you cann ot use different wrapper classes for return types in overriding
	 */
	
	public Integer add() {
		return 1;
	}
}
