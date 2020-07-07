package day_04;

public class Questions01 {
	
	public static void main(String[]srgs) {
		
			
		
		 //Print even numbers between 1-20 inclusive e.g.2 4 6 .. 20         		
		//1.way
		for (int i=1; i<=20; i++) {
			if(i%2==-0) {
				System.out.print(i+" ");
			}
		}
		//2.Way (gereksiz)
		System.out.println();
		for (int j = 1; j <= 10; j++) {
			System.out.print(2*j+" ");			
		}
		System.out.println();
		// Print odd numbers between 1-20 inclusive.e.g 1,3,5,7,...,19   Including comma
		
		for (int k = 1; k <=20; k++) {
			if(k%2!=0) {
				if(k<19) {
					System.out.print(k+",");
				}else if (k>=19) {
					System.out.println(k);
				}
			}
			
		}
		
		for(int j =1; j<=20; j+=2) {			
			if (j<19){
			System.out.print(j+ ",");	
			}
			else if(j==19) {
				System.out.print(j);
			}
	
		}		
		System.out.println();
		 //Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,..
		
		for (int l = 20; l >=1; l--) {
			if(l%5==0) {
				if(l>5) {
					System.out.print(l+",");
				}else {
					System.out.println(l);
				}
			}
			
		}
		
		// Find the sum of all even numbers form 1 - 20 inclusive
		
		int sum=0;
		for (int m = 1; m <=20; m++) {
			if(m%2==0) {
				sum+=m;				
			}			
		}
		System.out.println(sum);
		
		int num=1;
		int sum1=0;
		while(num<=20) {
			if(num%2==0) {
				sum1+=num;
			}
			num++;
		}
		System.out.println(sum1);
		
		// Print all numbers from 1-20 except 11 or 15		
		// use break or continue
				for (int i = 1; i <= 20; i++) {
					if (i == 11 || i == 15) {
						continue;// Difference between break and continue?
						// with break, java will get both of the loop
						// with continue, java will just skip that condition and continue the loop
					} else {
						System.out.print(i + " ");
					}
				}		
		
		
		
		for(int j =1; j<=20; j++) {			
			if(!(j==11) && !(j==15) && j<=20) {
				System.out.print(j+ " ");
			if ((j==11) || (j==15)){
			System.out.print(" ");	
			}
		
			}	
		}
		System.out.println();
		for(int j =1; j<=20; j++) {			
			if(!(j==11) && !(j==15) && j<=20) {
				System.out.print(j+ " ");		
			}	
		}
		
		
		
		
		
		
		}
		
		
	}


