package day45questionsdt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IQ01 {
	
	/*
	 INTERVIEW QUESTION
	 Create an array		 
	 */

	public static void main(String[] args) {
	
//		String[] letters;
//		letters = new String[]{"A", "B", "D", "C", "B", "A", "A", "A", "B", "B"};
		
		String arr[] = {"A", "B", "D", "C", "B",  "A", "A", "B", "B"};
		
		//1.Way
		//Set does not except repeted elements
		Set<String> set1 = new HashSet<>(); //Set ile yapilmasi gerekiyor for repeated elements
		for(int i=0; i<arr.length; i++) {
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i].equals(arr[k])) {
					set1.add(arr[i]);
				}
			}
		}
		System.out.println(set1);//[A, B]
		
		
		//Ik tane Set kullanmamizin dnedeni iki tane konteyner olusturup oraya numaralari aliyoruz
		Set<String> set2 = new HashSet<>();
		Set<String> set3 = new HashSet<>();
		
		for(String w: arr) {
			if(set2.add(w)==false) {
				
				set3.add(w);
			}
		}
		System.out.println(set2); //[A, B, C, D] Tekrar olmadan listede olan butun harfler
		System.out.println(set3);//[A, B] 2 harf tekrar etmistir
		
		//3.Way Kactane tekrar olmus onu buluyoruz
		Map<String, Integer> map = new HashMap<>();
		for(String w: arr) {
			int count=1;
			if(!map.containsKey(w)) {
				map.put(w,count); // burada listede tekrari olmayanlari sayiyor
			}else {
				map.put(w, map.get(w)+1); // burada ise tekrari olanlari aliyor ve yukardakileride ekleyerek kac harf kac defa bunu goruyoruz
			}
		}
		System.out.println(map);//{A=3, B=4, C=1, D=1}
		
		
		
		
		

	}

}
