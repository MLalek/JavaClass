package day21listsdt;

import java.util.ArrayList;
import java.util.Collections;

public class Reviews {

	public static void main(String[] args) {
		//Add
		ArrayList<String> birds = new ArrayList<>();
		birds.add("Eagle");
		birds.add(0,"Canary");
		birds.add("Papagai");
		birds.add(2,"Marti");
		birds.add(4,"Leylek");//5 yazarsak RTE veriyor
		System.out.println(birds);//[Canary, Eagle, Seabird, Papagai]
		
		ArrayList<String> fishs = new ArrayList<>();		
		fishs.add("X");
		fishs.add("Z");
		System.out.println(fishs);//[X, Z]
		
		//addAll
		fishs.addAll(birds);
		System.out.println(fishs); //[X, Z, Canary, Eagle, Marti, Papagai, Leylek]
		fishs.addAll(1,birds);		
		System.out.println(fishs);// [X, Canary, Eagle, Marti, Papagai, Leylek, Z, Canary, Eagle, Marti, Papagai, Leylek]
		
		//size()
		System.out.println(fishs.size());//12 length gibi element sayisini veriyor
		
		//remove
		fishs.remove(0);
		fishs.remove("Papagai");
		fishs.remove("Leyle");//hata vermez ve silmez
		birds.remove("Leylek"); 
		System.out.println(fishs);//[Canary, Eagle, Marti, Leylek, Z, Canary, Eagle, Marti, Papagai, Leylek]
		System.out.println(birds);//[Canary, Eagle, Marti, Papagai]
		//fishs.remove(10);//RTE		
		System.out.println(fishs);
		
		//set
		birds.set(0, "karga");
		System.out.println(birds);//[karga, Eagle, Marti, Papagai]
		
		
		//contains
		System.out.println(fishs.contains("karga")); //false
		
		//Colections.sort
		Collections.sort(birds);
		System.out.println(birds);//[Eagle, Marti, Papagai, karga]
		//kucuk harfin ASCII sayi degeri buyuk oldugu icin sona aldi
		
		
		
		
		
	}

}
