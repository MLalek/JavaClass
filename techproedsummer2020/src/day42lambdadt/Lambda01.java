package day42lambdadt;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
	/*
	 1)Lambda is "Functional Programming" (yani method programing)
	 2)Until now, we used "Structed Programming"  
	 */

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		//1.Way
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//2.Way 
		for(int w:list) {
			System.out.print(w + " ");
		}
		System.out.println();
		
		//1.Way
		//Print all elements on the console one by one using "Functional Programing"
		list.stream()
			.forEach(t->System.out.print(t+" ")); //t-> Action with "t" ==> Lambda Expression
		
		System.out.println();
		//2.Way
		list.stream()
			.forEach(System.out::print);//System.out::print==> Method reference ==> Class Name:: Method Name
		
		
		System.out.println();		
		//Print all even elements in the list on the console one by one by using "Structured Programming"
		for(int w:list) {
			if(w%2==0)
			System.out.print(w+" ");//12 4 6 2 4 12 
		}
		
		System.out.println();
		//Print all even elements in the list on the console one by one by using "Functional Programming"
		list.stream()
			.filter(Lambda01::isEven)   
									//How can I use "method reference instead of 't->t%2==0' ?
									// public static ... asagida main method un disina cikarak 
									//cift sayilari bul diye kendi kodumuzu olusturuyoruz
			.forEach(System.out::print);//12462412
		
		System.out.println();
		//Print all elements which are divisible by 3 in the list on the console one by one by using "Structured Programming"
		list.stream()
		.filter(t->t%3==0)
		.forEach(System.out::print);//12961215
		
		System.out.println();
		//Print the square of all odd elements by using "Functional Programming"
		list.stream()
		.filter(t->t%2!=0)// 9 13 15 filter() is used to filter the elements
//		.filter(Lambda01::isOdd) //Method reference olusturarak tek sayilari buluyor
		.map(t->t*t) //map() is used to update elements
		.forEach(t->System.out.print(t+" "));//81 169 225 
		
		
		System.out.println();
		//Print the cubes(a*a*a) of all even elements by using "Functional Programming"
		list.stream()
		.filter(Lambda01::isEven)
		.map(t->t*t*t)
		.forEach(t->System.out.print(t+" ")); //1728 64 216 8 64 1728 
		

	}
	
	public static boolean isEven(int num) {
		return num%2==0;
				
	}
	
	public static boolean isOdd(int num) {
		return num%2!=0;		
	}
	
	
	

}
