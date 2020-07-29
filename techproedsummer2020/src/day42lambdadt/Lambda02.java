package day42lambdadt;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {


	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
		
		//Print the number of characters of every element on the console by using "Functional Programming"		
		list.stream()
			.map(t->t + " = "+t.length()+" ") 
			.forEach(t->System.out.print(t));//Ali = 3 Mark = 4 Jackson = 7 Amanda = 6 Chris = 5 Tucker = 6 	
//			.forEach(t->System.out.print(t.length()+ " ")); //3 4 7 6 5 6 map ve forEach i kullanmadan sadece bu kod harf sayilarini veriyor 
		
		System.out.println();
		//Print the number of characters of elements which have more than 5 characters on the console
		//by using "Functional Programming"
		
		list.stream()
			.filter(t->t.length()>5)
			.map(t->t+"=" + t.length()+" ")
			.forEach(t->System.out.print(t));//Jackson=7 Amanda=6 Tucker=6 
			
			
		System.out.println();
		//Print the total number of characters of all elements
		System.out.println(list.stream()
			.map(t->t.length())
			.reduce(0, (t, u)->t+u));//31 listedeki isimlerdeki harflerin toplami
		
		/*
		 Add "!" to the end of every element
		 Find de multiblication 
		 
		 */
		
		//1.way to print out on the console  " int result = & System.out.println(result); "
		int result = list.stream()
			.map(t->t+"!")
			.filter(t->t.contains("k"))
			.map(t->t.length())
			.reduce(0, (t,u)->t+u);
		System.out.println(result);
		
		//2.Way to print out on the console
		System.out.println(list.stream()
				.map(t->t+"!")
				.filter(t->t.contains("k"))
				.map(t->t.length())
				.reduce(0, (t,u)->t+u)); //20
		
		
		System.out.println();
		/*
		 Find the multiblication of the length of every element which is starting with "A"
		*/
		
		int result1 = list.stream()
			.filter(t->t.startsWith("A"))
			.map(t->t.length())
			.reduce(1, (t,u)->t*u);
		System.out.println(result1);//18
		
		
		System.out.println();
		/*
		 Concatenate all elements 
		 Print it on the console
		  */		
		//1.Way
		String result2= list.stream()
		.reduce("", (t,u)->t+u);
		System.out.println(result2);//AliMarkJacksonAmandaChrisTucker
		//2.Way
		System.out.println(list.stream()
			.reduce("", (t,u)->t+u));//AliMarkJacksonAmandaChrisTucker		
		//3.Way
		list.stream()
        .forEach(t->System.out.print(t));//AliMarkJacksonAmandaChrisTucker
		
		System.out.println();
		/*
		 Print all elements in natural order
		 */
		list.stream()
			.sorted()
			.forEach(t->System.out.print(t+" "));//Ali Amanda Chris Jackson Mark Tucker 
		
		
		System.out.println();
		/*
		 Print the elements whose length is less than 6 in alphabetic order
		 */
		list.stream()
			.sorted()
			.filter(t->t.length()<6)
			.forEach(t->System.out.print(t + " "));//Ali Chris Mark 
		
		System.out.println();
		/*
		 Print the minimum of the lengths of the elements
		 */
		int result3 = list.stream()
			.map(t->t.length())
			.reduce(Integer.MAX_VALUE, (t,u) -> t<u ? t:u );
		
		System.out.println(result3);//3
		
		
		System.out.println();
		/*
		 Print the maximum value of the lengths of the elements
		 */
		int result4 = list.stream()
				.map(t->t.length())
				.reduce(Integer.MIN_VALUE, (t,u) -> t>u ? t:u );
			
			System.out.println(result4);//7
		
	}

}
