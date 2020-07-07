package day_04;

public class Reviews {

	public static void main(String[] args) {
		//Print even numbers between 1-20 inclusive e.g.2,4,6,..,20
		
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				System.out.print(i + "");
			}
		} 		System.out.println();
		
		// Print odd numbers between 1-20 inclusive.e.g 1,3,5,7,...,19   Including comma
		for(int j=1; j<=20; j++) {
			if(j%5==0) {
				System.out.print(j + ",");
			}
		} System.out.println();
		
		//Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,..
		
		
		for(int k=20; k>=1; k--) {
			if(k%5==0) {
				System.out.print(k + ",");
			}
		} System.out.println();
		
		
		//Find the sum of all even numbers form 1 - 20 inclusive
		
		int sum = 0;
		for(int l=1; l<=20; l++) {
			if(l%2==0) {
				System.out.print((sum +=l)+" ");
				
			}
		} 		System.out.print(sum);//110
		System.out.println();
		
		//Print all numbers from 1-20 except 11 or 15 (use break or continue)
		
		for (int i = 0; i <=20; i++) {
			if(i==11 || i==15) {
				continue;
				
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
