package day39collectionsdt;

import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

public class LHS01 {

	/*
	 1)LinkedHAshSet is a Set so no duplication
	 2)LinkedHAshSet puts the elements in insertion order
	 3)LinkedHAshSet accepts "nul" as an element
	 4)LinkedHAshSet overwrites if you add repeated elements
	 */
	
	public static void main(String[] args) {
		
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		Set<String> lhSet = new LinkedHashSet<>();
		lhSet.add("Ali");
		lhSet.add("Brandon");
		lhSet.add("Tucker");
		lhSet.add("Ali");
		lhSet.add("Cris");
		lhSet.add("Kavya");
		lhSet.add(null);		
		System.out.println(lhSet);
		LocalTime lt2 = LocalTime.now();
		System.out.println(lt2);
		
		Set<String> hSet = new LinkedHashSet<>();
		hSet.add("Ali");
		hSet.add("Brandon");
		hSet.add("Tucker");
		hSet.add("Ali");
		hSet.add("Cris");
		hSet.add("Kavya");
		hSet.add(null);
		LocalTime lt3 = LocalTime.now();
		System.out.println(lt3);
	}

}
