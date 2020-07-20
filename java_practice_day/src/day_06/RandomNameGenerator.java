package day_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomNameGenerator {
	
	/* Create a class : RandomNameGenerator
     * Step1: Ask user to enter his/her name //john walker
     * Step2: Delete the spaces in the username//johnwalker
     * Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146")
     * Step4: If there the username is not taken, then print: This username is available
     * Step5: If the username is already taken, then print This username is already taken
     * Step6: Then generate a random number, add to the name, and Print the new username 
     */

	public static void main(String[] args) {
	
		
		//Create a list
		
		 List<String> userList = new  ArrayList<>();
		 userList.add("John Walker");
		userList.add("John Marry");
		userList.add("samawalton");
		userList.add("Juliebrown");
		
		String myName="John Walker";
	  for(String name:userList) {
				if(name.equalsIgnoreCase(name)) {
					System.out.println("This username is already taken: " + myName.toLowerCase().replace(" ", ""));
					
					break;
				}else {
					System.out.println("This username is avaiblable");
					break;
				}
	  }
		
				

	}

}

	 
