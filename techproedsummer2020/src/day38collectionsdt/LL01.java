package day38collectionsdt;

import java.util.Collections;
import java.util.LinkedList;

public class LL01 {

	public static void main(String[] args) {
		// addFirst() adds the element at the beginning of the linked lidt
		LinkedList<String> sll = new LinkedList<>();
		sll.add("A");//[A]
		sll.addFirst("B");//[B,A]
		sll.addFirst("C");//[C,B,A]
		sll.add("B");
		sll.add("B");
		System.out.println(sll);//[C, B, A]
		
		//add.last() adds the element at the end of the linked list
		sll.addLast("N");//
		System.out.println(sll);//[C, B, A, N]
		
		//getFirst() gets the first element from the list
		System.out.println(sll.getFirst());//C
		
		//getLast() gets the last element from the list
		System.out.println(sll.getLast());//N
		
		//Collections.sort() puts the elements in natural order
		Collections.sort(sll);
		System.out.println(sll);//[A, B, C, N]
		
		//clear() removes all elements 
		//sll.clear();
		System.out.println(sll);//[]		
			
		//contains() check if a specific element exists in the list
		System.out.println(sll.contains("N"));//false cunku liste bos 
		
		//element() Retrieves and removes the head (first element) of this list.
		//If there is no first element you will get NoSuchElementException
		System.out.println(sll.element());//A
		
		System.out.println(sll.get(1));//B
		
		sll.removeFirstOccurrence("B");
		System.out.println(sll);//[A, B, B, C, N]
		
		sll.removeLastOccurrence("B");
		System.out.println(sll);//[A, B, C, N]
		
		
		
		
		
		
		
		
		
 
	}

}
