package day22foreachloopdt;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(16);
		
		System.out.println(list);
//		//Find the average value of all elements by using for-each loop
//		//For example; Average Value for 2, 4, 6 is (2+4+6)/3
//		
//		//To be able to get the average value in decimal I have to use double data
//		//type otherwise Java will cancel the decimal parts and return integer value
		double sum = 0;
		for(Integer w : list) {
			sum = sum + w;
			
		}
		System.out.println(sum); //66
		System.out.println(list.size()); //5
		System.out.println(sum/list.size());//66/5=13.2
		
		//Print all elements which are not starting with lower cases form the list 
		//by using for-each loop and continue
//		ArrayList<String> list1 = new ArrayList<String>();
//		list1.add("Ab");
//		list1.add("cd");
//		list1.add("Ef");
//		list1.add("gh");
//		list1.add("Ij");
//		
//		for(String m:list1) {
//			if(m.charAt(0)>='a' && m.charAt(0)<='z') {
//				continue;
//			}
//		}
//		System.out.println(list1);//[Ab, cd, Ef, gh, Ij] sonuc dogru degil
//		
		//Print just first 2 elements of list
		int count = 0; 
		for(int w : list) {
			System.out.println(w);
			count++;
			if(count==2) {
				break;
			}
		}
		
		//2.Way break olmadan
//		int count = 0;
//		for (int w : list) {
//			count++;
//			if (count>2) {
//				continue;
//			} System.out.println(w);
//		}
		
		

		
		
		
	}

}
