package day38collectionsdt;

import java.util.HashSet;

public class Quiz {

	public static void main(String[] args) {
		

			HashSet<String> hSet = new HashSet<>();

			hSet.add("Z");

			hSet.add("Y");

			hSet.add("X");

			hSet.add("X");

			System.out.println(hSet);//[X, Y, Z]

		}

	}


