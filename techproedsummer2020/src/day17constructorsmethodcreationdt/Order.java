package day17constructorsmethodcreationdt;

public class Order {
	String value = "a";

	   Order() { 
	       value = value + "b";	   }

	   Order(String c) {
	        value = value + c;
	   }
	

	public static void main(String[] args) {
		
//1		
//		Order order1 = new Order("r");
//		System.out.println(order1.value);//ar
//		Order order2 = new Order();
//		System.out.println(order1.value + order2.value);//arab

//2
//      Order order = new Order("f");
//		System.out.println(order.value); af
//  			


		
	}

}
