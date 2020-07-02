package day22foreachloopdt;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 6};

		List<Integer> list1 = new ArrayList<>();

		for(int w : arr) {

			list1.add(w); //w sirasiyle arr den degeri aliyor ve burda [3,4,5,6] 

		}
//		Which one of the followings does the same thing with 
//		the given code snippet?
		
//		int arr[] = {3, 4, 5, 6};
//
//		List<String> list1 = Arrays.asList(arr);
		
		
//		list.add(21);
//
//		list.add(22);
//
//		list.add(23);
//
//		Which ones of the followings are true?
//		
//		//1
//		int count = 0; 
//
//		for(int w : list) {
//
//				System.out.print(w + " ");
//
//				count++;
//
//				if(count==2) {
//
//					break;
//
//				}
//				
//				int count = 0; 
//
//				for(int w : list) {
//
//						count++;
//
//						if(count==2) {
//
//							continue;
//
//						}
//
//						System.out.print(w + " ");
//
//				}
//		int arr[] = { 1, 3, 5 };
//		
//		int x = 0;
//	
//				for (int w : arr) {
//	
//				x = x + w * w;
//	
//			}
//			System.out.print(x);
//			
//			//int arr[] = { 1, 3, 5, 7, 9 };
//	
//			for (int w : arr) {
//	
//				if(w<4) {
//	
//					continue;
//	
//				}
//	
//				System.out.print(w + " ");
//	
//			}
//			
//			int arr[] = { 1, 3, 5, 7, 9 };
//	
//			for (int w : arr) {
//	
//				System.out.print(w + " ");
//	
//				if(w>4) {
//	
//					break;
//				}
//	
//			}
//			
//			int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
//	
//			for (int[] w : arr) {
//	
//				for (int z : w) {
//	
//					System.out.print(z + " ");
//	
//				}
//	
//			}
//			
//			int arr[] = {3, 4, 5, 6};
//
//			List<Integer> list1 = new ArrayList<>();
//
//			for(int w : arr) {
//
//				list1.add(w);
//
//			}
//
//			System.out.println(list1.get(2));		
		
				

	}

}
