package day20arraysdt;

import java.util.Arrays;

public class QuestionMultDimAr {
	
	public static void main(String[] args) {
		
		
		// Bu uzun sekilde multidimentional olusturulabilir
		int mda [] [] = new int [2] [3]; 		
		System.out.println(Arrays.toString(mda[0])); //[0, 0, 0]
		System.out.println(Arrays.toString(mda[1])); //[0, 0, 0]
		System.out.println(Arrays.deepToString(mda));//[[0, 0, 0], [0, 0, 0]]
		
		// Bu kisa sekli
		//Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
		int mda1 []	[] = {{1,2,3}, {4,5,6}};
		
		int sum= 0;		
		System.out.println(Arrays.deepToString(mda1));
		for (int i = 0; i < mda1.length; i++) {
			
			for (int j = 0; j < mda1[0].length; j++) {
				sum += mda1[i][j];		
				//System.out.print(i+" ");//0 0 0 1 1 1
				
				System.out.print(j+" ");//0 1 2 0 1 2
			}			
		}
		System.out.println("sum= "+ sum);
		
		
		
		
	}

}
