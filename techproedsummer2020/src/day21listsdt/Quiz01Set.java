package day21listsdt;

import java.util.ArrayList;

public class Quiz01Set {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>() ;

		list.add( "A" );

		list.add( "B" );

		list.add( "F" );

		list.add( "D" );
		
		System.out.println(list);

//		list.set( 2, "C" );
//
//		System.out.println(list);

		for (int i = 0; i < list.size(); i++) { 		  

            System.out.print(list.get(i) + " "); 

        } 
	

	}

}
