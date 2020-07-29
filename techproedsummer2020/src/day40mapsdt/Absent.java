package day40mapsdt;

import java.util.Hashtable;
import java.util.Map;

public class Absent {
	public static void main(String[] args) {

		Map<String, Integer> ht = new Hashtable<>();

		ht.put("Apple", 10);

		ht.put("Apricot", 500);

		ht.put("Strawberry", 400);

		ht.put("Palm", 5000);

		System.out.println(ht);



		ht.computeIfAbsent("Orange", k -> 600);

		ht.computeIfAbsent("Apple", k -> 800);

		System.out.println(ht); //{Orange=600, Palm=5000, Strawberry=400, Apple=10, Apricot=500}

	}

}
