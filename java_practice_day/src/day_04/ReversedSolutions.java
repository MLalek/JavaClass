package day04;

import java.util.Scanner;

public class ReversedSolutions {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		   System.out.println("Please enter a sentence");
//			String name = scan.nextLine();
//		    int firstSpace = name.trim().indexOf(" ");
//		    System.out.println(firstSpace);
//		    int secondSpace = name.trim().lastIndexOf(" ");
//		    System.out.println(secondSpace);
//		    
//		    if(firstSpace != secondSpace) {
//		     	System.out.print(name.substring(secondSpace, name.length()).trim());
//		    	System.out.print(name.substring(firstSpace, secondSpace));
//		    	System.out.print(" " + name.substring(0, firstSpace));
//		    }else {
//		    	System.out.println("enter 3 words sentences");
//		    }
		//Kalem kagit kutu
		//kutu kagit Kalem
		

		  
//		    Scanner scan = new Scanner(System.in);
//			System.out.println("Please enter three word sentences");
//			String text = scan.nextLine();
//			int space=0;
//			String reversedText="";
//			for (int i = 0; i < text.length()-1; i++) {
//				if(text.charAt(i)== ' ') {
//					
//					space++;
//				}
//			}
//			if(space>1) {
//				String[] arr= text.split(" ");
//				for (int i = arr.length-1; i >= 0; i--) {
//					reversedText += arr[i]+" ";
//				}
//			}
//			else {
//				System.out.println("It is not a 3 words sentences");
//			}
//			System.out.println(reversedText);
		//Kalem kagit kutu
		//kutu kagit Kalem
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please, enter a String: ");
		String str = scan.nextLine();
		
		for (int i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
			//KAlem kagit kutu
			//utuk tigak melAK
		}
		
		scan.close();
		    
		    
	}

}
