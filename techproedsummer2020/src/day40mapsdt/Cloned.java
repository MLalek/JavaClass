package day40mapsdt;

import java.util.Hashtable;

public class Cloned {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		Object clonedHt = new Hashtable<Integer, String>();

		ht.put(3, "B");

		ht.put(2, "A");

		ht.put(1, "C");



		clonedHt = ht.clone();

		System.out.println(clonedHt);



		ht.clear();

		System.out.println(ht);

		System.out.println(clonedHt);//{3=B, 2=A, 1=C}

										// { }

										//{3=B, 2=A, 1=C}

	}

}
