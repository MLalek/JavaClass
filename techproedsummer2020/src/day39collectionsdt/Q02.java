package day39collectionsdt;


import java.util.PriorityQueue;
import java.util.Queue;

public class Q02 {
	/*
	 When you use PriorityQueue to create a Queue sometimes
	 elements will be in natural order, sometimes JAva will put in order
	 according to some comprasion rules.
	 But every time first element is being the first according to the natural order
	 */

	public static void main(String[] args) {
		
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("Cris");
		q1.add("Brandon");
		q1.add("Tucker");
		q1.add("Ali"); //Ortadan Aliyi en son ekledim
		q1.add("Cris");
		q1.add("Mark");
		System.out.println(q1);//[Ali, Brandon, Mark, Cris, Cris, Tucker]
		
		//element() ile peek() arasindaki fark eger liste bos ise NulException verir ama peek null verir
		System.out.println(q1.element());//Ali 
		System.out.println(q1);// [Ali, Brandon, Mark, Cris, Cris, Tucker]
		
		System.out.println(q1.poll());//Ali
		System.out.println(q1);//[Brandon, Cris, Mark, Tucker, Cris]
		
		System.out.println(q1.peek());//Brandon
		System.out.println(q1);//[Brandon, Cris, Mark, Tucker, Cris]
		
		System.out.println(q1.getClass());// class java.util.PriorityQueue class in ismini verir
		
		System.out.println(q1.hashCode());//366712642

	}

}
