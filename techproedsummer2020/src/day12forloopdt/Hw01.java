package day12forloopdt;

public class Hw01 {
	
	public static void main(String[]args) {
		
		
		//Write a program to print counting numbers 
				//from 10 to 57 on the console by using for-loop.
				
		       		
				for(int y=10; y<=57; y++) {
					System.out.print(y+" ");
				}
				
				System.out.println();
				
				//Write a program to print even counting numbers 
		        //from 100 to 43 on the console by using for-loop.
				
				for (int y=100; y>=43; y--) {
					if(y%2==0) {
						System.out.print(y +" ");
					}					
				}
				System.out.println();
				
				//Write a program to print odd counting numbers 
				//from 200 to 33 on the console by using for-loop.
				
				for (int y=200; y>=33; y--) {
					if(y%2==1) {
						System.out.print(y+" ");
					}					
					}
				System.out.println();
				
				//Write a program to add counting numbers from 23 to 57 by using for-loop.
				//Print the sum on the console
				
				int sum=0;
				for (int y=23; y<=57; y++) {
					sum = sum +y;
					//System.out.print(sum);
				}
				System.out.println(sum);//1400
				
				System.out.println();
				
				//Write a program to multiply counting numbers from 7 to 15 by using for-loop.
				//Print the multiplication on the console
	
				int product = 1;
				for (int y=7; y<=15; y++) {
					product = product *y;
				}
				System.out.println(product);
				
				System.out.println();
				
				// Write a program to print counting numbers which are less than 200 and divisible by 5
				//On the console by using for-loop.
				for (int y=200; y>0; y--) {
					if(y%5==0) {
						System.out.print(y+" ");
					}
				}
		
		
	}

}