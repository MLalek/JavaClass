package day44lambdadt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class L02 {

	public static void main(String[] args) {
		
		//We cannot use arrays in Lambda, but 
		int a[] = {12, 9, 13, 5, 8};		
		List<int[]> al = Arrays.asList(a);
		al.stream()
		  .sorted()
		  .forEach(t->System.out.println(Arrays.toString(t)+ " "));//[12, 9, 13, 5, 8] 
		
		//Instead of loops we can use IntStream
		IntStream.range(3,8)
				 .forEach(t->System.out.print(t +" "));//3 4 5 6 7 
		
		System.out.println();
		IntStream.rangeClosed(3, 8)
				 .forEach(t->System.out.print(t + " "));//3 4 5 6 7 8
		
		System.out.println();
		//Find the sum of the integers from 3 to 8		
		int sum1 = IntStream.rangeClosed(3, 8)
				 .sum();	
				 
		System.out.println(sum1);//33
		
		System.out.println();
		//Find the sum of the even integers from 3 to 8	
		int sum2 = IntStream.rangeClosed(3, 8)
				 .filter(t->t%2==0)
				 .sum();
		System.out.println(sum2);//18
		
		//Find the multiplication of the integers from 3 to 8
		int prod1 = IntStream.rangeClosed(3, 8)
				 .reduce(1, (t,u)->t*u);
		System.out.println(prod1);//20160
		
		
		
		//Find 7 factorial ==> 7! = 7x6x5x4x3x2x1
		//Get the value from user and calculate its factorial
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its factoriel");
		int num = scan.nextInt();
		int prod2 = IntStream.rangeClosed(1, num) //num u biz verecegiz console de
							 .reduce(1, (t,u)->t*u);	
		System.out.println(num + "! ="+prod2);
		
		
		//Find the multiplication of first 7 even counting numbers (2,4,6,8,10,12,14)
		//1.way:not recomended
		int prod3 = IntStream.rangeClosed(1, 14)
                .filter(t->t%2==0)
                .reduce(1, (t,u)->t*u);
		System.out.println(prod3);//645120
		
		
		//2.Way Recommended
		int prod4 = IntStream.iterate(2, t->t+2)//cift sayi oldugu icin 2 ile basla, iterate means use in every step adding +2 sinirsiz devam eder limit(7) ile durduruyoruz
							 .limit(7) //7 times makes then stop
							 .reduce(1, (t,u)->t*u);
		System.out.println(prod4);//645120
		
		//Find the multiplication of first 9 odd counting numbers (use iteraters() and limit() )
		int prod5 = IntStream.iterate(1, t->t+2)
							 .limit(9)
							 .reduce(1, (t,u)->t*u);
		System.out.println(prod5);//34459425
		
		
		//Find the multiplication of first 5 odd counting numbers which are grater than 6/ (use iteraters() and limit() )
		int prod6 = IntStream.iterate(7, t->t+2)
	             .limit(5)
	             .reduce(1,  (t,u)->t*u);
		System.out.println(prod6);//135135
		
		
		
	}

}
