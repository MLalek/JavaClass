package day_08;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	/*
     * 1. Create Queue of Integer with object type if LinkedList : link
     * add the numbers: 45,54,26,63
     * print
     * remove the fist element without using any index(poll) and print
     * remove the next element and print
     * print the next element without removing
     * 
     * 2. Create:
     * Queue<Integer> pque = new PriorityQueue<>();
     * add teh same numbers and print
     * use poll and peek finctions to manupilate the data
     * 
     * 
     * 3. What is the major differences between linkedlist and PriorityQueue
     */
	public static void main(String[] args) {
		
		Queue<Integer> link=new LinkedList<>();
		link.add(45);
		link.add(54);
		link.add(26);
		link.add(63);
		System.out.println(link);
		//removing the element from the given order. FIFO(first in first out)
		link.poll();
		System.out.println(link);
		link.poll();//this will return null if there is no element to be removed
		System.out.println(link);
		System.out.println(link.poll());//This will return the number that is removed
		System.out.println(link);
		System.out.println(link.peek());//return next without removing
		System.out.println(link);
		
		System.out.println("-------PriortyQueue--------");
		Queue<Integer> pque = new PriorityQueue<>();
		pque.add(45);
		pque.add(54);
		pque.add(26);
		pque.add(63);
		pque.add(10);
		System.out.println(pque);
		pque.poll();//remove 10. will remove the smallest number every time we call it(natural order).
		System.out.println(pque);
		pque.poll();//remove 26
		System.out.println(pque);
		pque.poll();//remove 45
		System.out.println(pque);
		pque.poll();//remove 54
		System.out.println(pque);
		
		//3. What is the major differences between linkedlist and PriorityQueue
		//linkedlist: removes FIFO order
		//priorityque: poll() removed in the natural order

	}

}
