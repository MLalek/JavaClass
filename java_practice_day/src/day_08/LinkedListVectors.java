package day_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListVectors {
	/*
	 * What is the difference between Arraylist and LinkedList?
	 * Arraylist is faster when we access the data
	 * Linkedlist is good when manipulate the data-like adding or removing
	 * Arraylist can only implement List interface but linkedlist can implement both List and Queue interfaces
	 * 
	 */
	/*
	 *1. Create a class: LinkedListVector
	 * Create an arraylist of string: arrayList
	 * and add the names: john, sam, tom, matt
	 * Remove the second value in the list
	 * Change the first value-john- with juan
	 * 
	 *2.  Create a linkedlist of string:linkedList 
	 * add the names: zoe, marry, sue, elon
	 * remove the names is there if the name contains 'n' in it
	 * 
	 * 
	 * 3. Create a Vector of list :vec
	 * And add the strings: apple, orange, banana, lettuce
	 * and remove banana from the vector
	 */
	public static void main(String[] args) {
		List<String> arrayList=new ArrayList<>();
		arrayList.add("john");
		arrayList.add("sam");
		arrayList.add("tom");
		arrayList.add("matt");
		System.out.println(arrayList);
		//remove the 2nd value
		arrayList.remove(1);
		//arrayList.remove("sam");
		System.out.println(arrayList);
		arrayList.set(0, "juan");
		System.out.println(arrayList);
		System.out.println("----linkedlist-----");
		
//		 *2.  Create a linkedlist of string:linkedList 
//		 * add the names: zoe, marry, sue, elon
//		 * remove the names if the name contains 'n' in it
		List<String> linkedList=new LinkedList<>();
		linkedList.add("zoe");
		linkedList.add("marry");
		linkedList.add("sue");
		linkedList.add("elon");
		System.out.println(linkedList);
//		for(String w:linkedList) {
//			if(w.contains("n")) {
//				linkedList.remove(w);
//			}
//			
//		}
		for (int i=0;i<linkedList.size();i++) {
			if(linkedList.get(i).contains("n")) {
				linkedList.remove(i);
				
			}
		}
		System.out.println(linkedList);
		System.out.println("--------Vector-------");
//		 * 3. Create a Vector of list :vec
//		 * And add the strings: apple, orange, banana, lettuce
//		 * and remove banana from the vector
		//Vectors and arraylist are almost the same
		//The only difference is arraylist are not synchronized. 
		//Vectors are synchronized
		//Creating a Vector object
		List<String> vec=new Vector<>();
		vec.add("apple");
		vec.add("orange");
		vec.add("banana");
		vec.add("lettuce");
		System.out.println(vec);
		vec.remove("banana");
		System.out.println(vec);
		
	}


}
