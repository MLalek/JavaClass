package day38collectionsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
	public static void main(String[] args) {

//		1)
//		List<String> list = new ArrayList<>();
//
//		list.add("X");
//
//		list.add("Y");
//
//		list.add("Z");
//
//
//
//		ListIterator<String> it = list.listIterator();		
//
//		while(it.hasNext()) {	
//
//			Object el = it.next();
//
//			it.set(el + "!");			
//
//		}
//
//		System.out.println(list); // [X!, Y!, Z!]
		
//		2)
//		List<String> list = new ArrayList<>();
//
//		list.add("X");
//
//		list.add("Y");
//
//		list.add("Z");
//
//
//
//		for(String w : list) {
//
//			w = w + "!";
//
//		}
//
//		System.out.println(list);//[X, Y, Z]
		
		
//		3)
        List<String> list = new ArrayList<>();

		list.add("X");

		list.add("Y");

		list.add("Z");

		

		ListIterator<String> it = list.listIterator();		

		while(it.hasNext()) {	

		Object el = it.next();
			

		System.out.print((el + " ")); //X Y Z 		
			
		}
		
		

}
}
