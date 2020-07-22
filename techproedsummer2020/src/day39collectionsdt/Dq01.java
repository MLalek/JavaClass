package day39collectionsdt;

import java.util.Deque;
import java.util.LinkedList;


public class Dq01 {
	/*
	 Deque: Double Ended Queue is an interface
	 
	 Not: For Queue's you can add new element at the end of the Queue but for Deque
	 	  you can add elements to the end and to the beginning
	 	  
	 	  For Queue's you can remove elements from the beginning of the Queue but for Deque
	 	  you can remove elements from the beginning and from the end of the Deque
	 */

	public static void main(String[] args) {

		Deque<String> q1 = new LinkedList<>();
		q1.add("Ali");
		q1.add("Brandon");
		q1.add("Tucker");
		q1.add("Cris");
		q1.add("Mark");
		q1.add(null);
		System.out.println(q1);//[Ali, Brandon, Tucker, Cris, Mark, null]
		
		q1.addFirst("XXX");
		System.out.println(q1);//[XXX, Ali, Brandon, Tucker, Cris, Mark, null]
		
		q1.addLast("ZZZ");
		System.out.println(q1);//[XXX, Ali, Brandon, Tucker, Cris, Mark, null, ZZZ]
		
		q1.removeFirst();
		System.out.println(q1);//[Ali, Brandon, Tucker, Cris, Mark, null, ZZZ]
		
		q1.removeLast();
		System.out.println(q1);//[Ali, Brandon, Tucker, Cris, Mark, null]
		
		//If add() or addLast() cannot add the element for any reson, they throw
		//IllegalStateException, but if offer() cannot add the element for any reason, it returns false.
		q1.offer("YYY");
		System.out.println(q1);//[Ali, Brandon, Tucker, Cris, Mark, null, YYY]
		
		
		
		
		

	}

}
