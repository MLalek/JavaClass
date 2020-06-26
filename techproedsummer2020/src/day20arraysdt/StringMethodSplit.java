package day20arraysdt;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodSplit {

	public static void main(String[] args) {
		//How to split a String by using character/characters
		String s = "I like to move it move it";
		String t[] = s.split("move");
		//If you use "move" to split, "move" will be disappear from the String
		System.out.println(Arrays.deepToString(t));//[I like to ,  it ,  it]
		
		// How to count the number of words in a String
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String w = sc.nextLine();
		
		String y[] = w.split(" ");
		System.out.println(Arrays.toString(y));
		System.out.println(y.length);
		
		sc.close();

	}

}
