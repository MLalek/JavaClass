package day39collectionsdt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class T01 {
	
	/*
	 1)TreeSet is a Set so no duplication
	 2)TreeSet puts the elements in natural order
	 3)TreeSet is the slowest Set
	 4)TreeSet does not accept null as an element, 
	 	if you try to add null, you will get NullPointerException
	 	5)If you try to add repeated elements, Java will overwrite
	 */

	public static void main(String[] args) {
	
	LocalTime lt1 = LocalTime.now();
	System.out.println(lt1);//16:48:11.282
	Set<String> tSet = new TreeSet<>();
	tSet.add("Ali");
	tSet.add("Mark");
	tSet.add("Brandon");
	tSet.add("Angine");
	//tSet.add(null);
	tSet.add("Ali");
	System.out.println(tSet);//[Ali, Angine, Brandon, Mark]
	LocalTime lt2 = LocalTime.now();	
	System.out.println(lt2);//16:48:11.293
	
	Set<String> hSet = new HashSet<>();
	hSet.add("Ali");
	hSet.add("Mark");
	hSet.add("Brandon");
	hSet.add("Angine");
	
	Set<String>tSet2 = new TreeSet<>(hSet);//Converting to HashSet to TreeSet
	System.out.println(tSet2);
	
	LocalTime lt3 = LocalTime.now();	
	System.out.println(lt3); //16:48:11.294 nano second
	
	/*
	 When do we need to use TreeSet you have two options
	 1)Directly create a TreeSet and add the elements to it
	 2)Create a HAshSet, add the elements to HAshSet then convert the HAshSet to TreeSet
	 
	 First way works but it is slow, to make your code faster use the second way.
	 */
	
	
	}
}
