package day20arraysdt;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// If the elements of an Array are Arrays then
		// the Array is called multidimensional array. 
		
		//How to create multidimensional array
		int mda[] [] = new int [3] [2];//3 inner array and 2 element in each inner array  //[ [0,0,], [0,0], [0,0] ] outer array en distaki array 

		//How to print a multidimensional array on the console
		System.out.println(Arrays.deepToString(mda));//[[0, 0], [0, 0], [0, 0]]

		//How to add an ellement into a multidimensional array
		mda [0] [0] = 5;
		System.out.println(Arrays.deepToString(mda));
		
		mda [1] [0] = 7;
		System.out.println(Arrays.deepToString(mda));
		
		mda [2] [1] = 11;
		System.out.println(Arrays.deepToString(mda));
		
		mda [0] [1] = 9;				
		mda [1] [1] = 8;
		mda [2] [0] = 6;
		System.out.println(Arrays.deepToString(mda));
		
		System.out.println(Arrays.toString(mda[0]));//[5, 9]
		System.out.println(Arrays.toString(mda[1]));//[7, 8]
		System.out.println(Arrays.toString(mda[2]));//[6, 11]
		
		// How to create a multidimensional array in short way
		int mda1[] [] = {{3,4,5}, {6}, {7,8}};
		System.out.println(Arrays.deepToString(mda1));
		
				}
	}



