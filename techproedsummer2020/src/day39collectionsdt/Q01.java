package day39collectionsdt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q01 {
	
	/*
	 1)Queue is an interface not a class so we cannot create object by using Queue
	 When you want to work on Queue you can create objects by using 
	  	a)LinkedList class or
	  	b)PriorityQueue class
	 2)In Queue every time elements are added to the end of the the Queue, when you remove an element
	 every time it will be removed from the beginning of the Queue.
	 	FIFI==>First In First Out
	 	
	 	Note:if items have expiration date (for product of farmasy) 
	 */

	public static void main(String[] args) {
		
		Queue<String> q1 = new LinkedList<>();
		q1.add("Ali");
		q1.add("Brandon");
		q1.add("Tucker");
		q1.add("Ali"); //Ortadan Aliyi en son ekledim
		q1.add("Cris");
		q1.add("Mark");
		q1.add(null);
		System.out.println(q1);//[Ali, Brandon, Tucker, Ali, Cris, Mark, null]
		
		q1.remove();
		System.out.println(q1);//[Brandon, Tucker, Ali, Cris, Mark, null] Ilk ekleneni remove ilk cikarir
		
		q1.remove();
		System.out.println(q1);//[Tucker, Ali, Cris, Mark, null] ikici silinen Brandon oldu
		
		q1.remove(null);
		System.out.println(q1);//[Tucker, Ali, Cris, Mark]
		
		List<String> list = new ArrayList<>();
		list.add("Brandon");
		list.add("Tucker");
		System.out.println(list);//listede olanlari asagida remove all ile q1 listesinden cikarttik
		
		q1.removeAll(list);
		System.out.println(q1);//[Ali, Cris, Mark] List te list olarak secilen butun Brandon ve Tuckerlari sil
		
		//element() returns the first element without removing
		System.out.println(q1.element());//Ali kopyaladi(secildi) console de tek gostemek icin
		System.out.println(q1);//[Ali, Cris, Mark]
		
		//pol() returns the first element after removing 
		System.out.println(q1.poll());//Ali  poll() listeden ilk ismi siliyor ve sildigi ismi listede gosteriyor
		System.out.println(q1);//[Cris, Mark]
		
		//peek() returns the first element after removing
		//If Queue is empty peek() does not give exception it returns "null"
		System.out.println(q1.peek());//Cris
		System.out.println(q1);//[Cris, Mark]
		
		//q1.clear();//It removed all elements
		
		System.out.println(q1.peek());//null
		System.out.println(q1.element());//NoSuchElementException

		
		
	
	}

}
