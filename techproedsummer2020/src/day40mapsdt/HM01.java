package day40mapsdt;

import java.util.HashMap;

public class HM01 {
	/*
	 1)HashMap is NOT synchronized
	 2)HashMap is NOT multi-thread(thread-safe)
	 3)HashMap uses key-value structure(key==>unique  value==>Allows duplication)
	 4)For keys you can use "null" values
	 5)For values you can use "MULTIPLE null" values
	 6)HashMap is fast
	 7)HAshMap does not put elements in any order
	   Elements are in random order
	 */

	public static void main(String[] args) {
		HashMap<Integer, String>hMap = new HashMap <>();
		
		hMap.put(100, "Mark");
		hMap.put(101, "Angie");
		hMap.put(107, "Brandon Jackson");
		hMap.put(103, "A");
		hMap.put(111, "Tom");
		hMap.put(102, "Angie");
		//If you try to use duplicated keys Java will overwrite
		hMap.put(111, "Carl");
		//Using "null" for keys is allowed. If you try to use null more than once Java will overwrite
		hMap.put(null, "Chris");
		hMap.put(null, "Charlie");
		//To use multiple null for values part is allowed.
		hMap.put(105, null);
		hMap.put(106, null);
		System.out.println(hMap);
		
		System.out.println(hMap.containsKey(102));//true
		System.out.println(hMap.containsValue("Tom"));//false ==> Tom is overwritten
		System.out.println(hMap.containsValue("Carl"));//true
		
		System.out.println(hMap.get(103));//A
		System.out.println(hMap.get(123));//null
		
		System.out.println(hMap.getOrDefault(123, "There is any key 123"));
		
		System.out.println(hMap.hashCode());//-1059264128
		
		//Burada onemli olan [] ler icinde olmasi ve keys cagirmasi 		
		System.out.println(hMap.keySet());//[null, 100, 101, 102, 103, 105, 106, 107, 111]
		
		System.out.println(hMap.values());//[Charlie, Mark, Angie, Angie, A, null, null, Brandon Jackson, Carl]
		
		System.out.println(hMap.putIfAbsent(107, "Miami"));//Brandon Jackson 107 de Brandon vardi onu verdi
		System.out.println(hMap.putIfAbsent(222, "Miami")); //Listede olmadigi icin bunu listeye ekliyor		
		System.out.println(hMap); //{null=Charlie, 100=Mark, 101=Angie, 102=Angie, 103=A, 105=null, 106=null, 107=Brandon Jackson, 222=Miami, 111=Carl}
		
		System.out.println(hMap.remove(107, "Brandon Jackson"));//true verdi
		System.out.println(hMap);// 107 de Brandon var (true) ve o zaman siliyor
		
		
		hMap.replace(103, "A", "Z");//
		System.out.println(hMap);//103 A ==> 103 Z oldu
		
		System.out.println(hMap.size());//9
		
		
	}

}
