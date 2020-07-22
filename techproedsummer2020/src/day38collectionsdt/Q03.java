package day38collectionsdt;

import java.util.LinkedList;

public class Q03 {
	
		public static void main(String[] args) {

			LinkedList<String> sll = new LinkedList<>();

			sll.add("B");

			sll.add("A");

			sll.addFirst("B");

			sll.addFirst("C");

			sll.add("B");

		}

	}

//All Correct Answers:
//	1)
//System.out.println(sll.getLast() + sll.getFirst() + sll.get(2));
//Prints BCB on the console
//    2)
//sll.removeLastOccurrence("B");
//System.out.println(sll);
//Prints [C, B, B, A] on the console
//	3)
//sll.removeFirstOccurrence("B");
//System.out.println(sll);
//Prints [C, B, A, B] on the console
//	4)
//System.out.println(sll)
//Prints [C, B, B, A, B] on the console






