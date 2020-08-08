package day_06;

public class SumOfThrees {
	/*
	 * write a method that accepts an array and prints true if the sum of all 3's in
	 * the array is exactly 9
	 * 
	 * Input : {2,3,5,3,6,3,7} output :true 
	 * Input : {2,3,4,5,6,3,7} output :false
	 */
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,3,7};
		int count = 0;
		
		for(int each: arr) {
			if(each==3) {
				count +=3;
			}
		}
		if(count==9) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}


}
