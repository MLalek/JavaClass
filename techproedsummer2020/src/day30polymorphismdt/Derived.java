package day30polymorphismdt;

public class Derived {
	
	public void getDetails(String temp) {
		System.out.println("Derived class" + temp);
	}

}


//class Test extends Derived {
//	public int getDetails(String temp) {//Different methods can be if you want to override but in here int and String can not be 
//										// you should change String to int	
//		System.out.println("Test class" + temp);
//		return 0;
//	}
//}