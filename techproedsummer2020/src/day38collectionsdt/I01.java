package day38collectionsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		// Another usage of Iterators
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list);//[A, B, C, D, E]
		
		ListIterator<String> list2 = list.listIterator();
		while(list2.hasNext()) {
			String el = list2.next();
			list2.set(el + "X"); 
			//System.out.println(list);//[AX, B, C, D, E]
									//[AX, BX, C, D, E]
									//[AX, BX, CX, D, E]
									//[AX, BX, CX, DX, E]
									//[AX, BX, CX, DX, EX]
									//[AX, BX, CX, DX, EX]
		}
		System.out.println(list);//[AX, BX, CX, DX, EX]
		
		//Print the elements on the console in reverse order
		
		/*
		 If you decide to use hasPrevious() and previous() methods you have to use hasNext() and next()
		 methods first to move the pointer to the end of the list 
		 */
		while(list2.hasPrevious()) {
			Object el = list2.previous();
			System.out.print(el + " ");
		}
		
		
		
		
		
		
		
		
		
	}

}
