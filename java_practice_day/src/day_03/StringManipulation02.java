package day_03;

import java.util.Scanner;

public class StringManipulation02 {

	public static void main(String[] args) {
		 //ask user to enter 2 words : name1 and name2
		//if the name1 has even numbers of characters, 
		//then insert the second word in the middle of the first name 
		//if the first word has odd numbers
		//Then print the “Name2 cannot be inserted in the name1”
		//
//				e.g: 
//				name1= mehmet
//				name2= ahmet 
//		    Print ==>  mehahmetmet
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String word1=sc.next();
		String word2=sc.next();
		
		
		//check if word1 has odd or even number of characters? 		
		boolean isTrue=word1.length()%2==0; // bloean can also used
		//System.out.println(word1.length()/2);//Beginning index is inclusive
				
		String firstHalf=word1.substring(0, word1.length()/2);
		//Beginning index inclusive  But end index ins exclusive
		
		String secondHalf=word1.substring(word1.length()/2);
		
		if (isTrue) {
			System.out.println(firstHalf + word2 + secondHalf);
		} else {
			System.out.println("Name2 cannot be inserted in the name1");
		}
		
	sc.close();
	
	
//	String name1= "Mehmet";
//    String name2= "ahmet";
//    int length = name1.length();
//    
//    String firstHalf = name1.substring(0, length/2);
//    String secondHalf = name1.substring(length/2);
//
//    if (length%2==0) {
//        System.out.println(firstHalf + name2 + secondHalf);
//    }else {
//        System.out.println("name is not even");
//    }
//	
	
	
	
	
	}

}
