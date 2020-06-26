package day19staticblockarraysdt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {		
		String arr[] = {"Angie", "Leo", "Brad", "adam", "Jack"};
		System.out.println(Arrays.toString(arr));//[Angie, Leo, Brad, Adam, Jack]
		
		//How to sort elements in ascending order
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[Adam, Angie, Brad, Jack, Leo]
		
		//For numbers we use "ascending order", for String we use "alphabetical order"
		//"ascending order" and "alphabetical order" both are called "Natural Order"

	}

}
