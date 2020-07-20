package day37iteratorscollectionsdt;

import java.util.LinkedList;
import java.util.List;

public class LL01 {
	/*
	 1)Linked lists do not use indexes because of that in Linked lists accessing elements 
	 directly is difficult if you need to access to an element directly use Arraylist
	 Not:Geçici listeler (muze ziyaretcisi gibi)
	 2)Adding and removing elements are ver in Linked lists. Because of that if our program
	  will do most of the time adding and removing operations using linked list is the best way.
	  Not:Kalici listeler (sehir nufusu gibi) 
	 */

	public static void main(String[] args) {
		
		List<String> llist = new LinkedList<>();
		llist.add("Steve");
		llist.add("Carl");
		llist.add("Raj");
		llist.add("Megan");
		llist.add("Ali");
		System.out.println(llist);
		
		llist.add(2, "xxx");
		System.out.println(llist);//[Steve, Carl, xxx, Raj, Megan, Ali]
		
		List<String> llist1 = new LinkedList<>();
		llist1.add("BBB");
		llist1.add("AAA");
		
		llist.addAll(llist1);
		System.out.println(llist);//[Steve, Carl, xxx, Raj, Megan, Ali, BBB, AAA]
		
		llist.addAll(4, llist1);
		System.out.println(llist);// [Steve, Carl, xxx, Raj, BBB, AAA, Megan, Ali, BBB, AAA]
		
		llist.remove(2);
		System.out.println(llist);// [Steve, Carl, Raj, BBB, AAA, Megan, Ali, BBB, AAA]
		
		llist.remove("AAA");
		System.out.println(llist);// [Steve, Carl, Raj, BBB, Megan, Ali, BBB, AAA]
		
		llist.removeAll(llist1);
		System.out.println(llist);//[Steve, Carl, Raj, Megan, Ali]`
		
		
	}

}
