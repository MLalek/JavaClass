package day40mapsdt;

import java.util.Hashtable;
import java.util.Map;

public class HT01 {
	/*
	 1)HashTable uses key-value structure
	 2)HashTable is Sychronized
	 3)HashTable is Thread Safe
	 4)HashTable is not ordered
	 5)For HashTable, you zannot use "null" for keys and values
	 6)HAshTable is slow ccording to HashMap
	 */

	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>(); //String String olmasinin nedeni iki String kullanacak olmasi
													//Sozlukte kelime ve aciklamasi ikis de String olacak
		
		ht.put("Cat", "Meow");
		ht.put("Dog", "Bark");
		ht.put("Lion", "Roar");
		ht.put("Bee", "Buzz");
		ht.put("Cow", "Moo");
		//If you use "null" for key of a HAshTable you will get NullPionterExeption
		//ht.put(null, "Yell");
		
		//If you use "null" for key of a HashTable you will get NullPionterExeption
		//ht.put("Chicken", null);
		
		
		System.out.println(ht);//{Dog=Bark, Bee=Buzz, Lion=Roar, Cat=Meow, Cow=Moo}
		
		System.out.println(ht.keySet());//[Dog, Bee, Lion, Cat, Cow]
		
		Map<String, String> ht1 = new Hashtable<>();
		ht1.put("C", "M");
		ht1.put("D", "B");
		ht1.put("L", "R");
		
		//Copies all of the mappings for the specified map to this map
		ht.putAll(ht1);
		System.out.println(ht);

	}

}
