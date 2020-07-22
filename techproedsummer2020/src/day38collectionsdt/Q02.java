package day38collectionsdt;

import java.util.HashSet;
import java.util.Iterator;

public class Q02 {
	
	public static void main(String[] args) {

		 HashSet<String> hs = new HashSet<>();

		 hs.add("A");

		 hs.add("B");

		 hs.add("A");

		 hs.add("B");

		 hs.add("C");

		 Iterator<String> i = hs.iterator(); 

	     while (i.hasNext()) { 

	        System.out.print(i.next() + "! ");//A! B! C! Parantez icerisindeki methodlar [] olmuyor

	     }

	}



}
