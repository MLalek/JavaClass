package day37iteratorscollectionsdt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(21);
		list.add(22);
		list.add(23);
		//System.out.println(list);
		
		//Loops can not update a list, loops can navigate among the elements but cannot update them
		for(int w: list) {
			w=w+5;			
		}
		
		
		//System.out.println(list);//[21, 22, 23]
		//To update a list we use Iterators.
		//Always use while loop with Iterators 
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Object el = it.next();
			//System.out.println(el);
			it.remove();
			//System.out.println(list); // [22, 23]
									 //[23]
		}
		
		System.out.println(list);//[]
		
		List <Integer>list1 = new ArrayList<>();
		list1.add(31);
		list1.add(32);
		list1.add(33);
		//System.out.println(list1);
		
		//Increase the value of every element by 5
		ListIterator<Integer> lit = list1.listIterator();
		while (lit.hasNext()) {
			//Object el = lit.next(); // Object data type icerisinde add methodu olmadigi icin Object i Integer yap
			Integer el = lit.next();
			lit.set(el+5);
			//System.out.println(list1); //[36, 32, 33]
									   //[36, 37, 33]
									   //[36, 37, 38]
		}
		
		System.out.println(list1);//[36, 37, 38]
		
		List<String> list2 = new ArrayList<>();
		list2.add("Laborgeny");
		list2.add("Ferrari");
		list2.add("Bently");
		System.out.println(list2);
		
		ListIterator<String> cars = list2.listIterator();
		while(cars.hasNext()) {
			String ek = cars.next();
			cars.set(ek.replace(ek.substring(ek.length()-3), "***"));			
		}
		System.out.println(list2);
		
		}

}
