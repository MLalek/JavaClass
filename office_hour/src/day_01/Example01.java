package day_01;

public class Example01 {
	
	/*
	 	Write a Java program to compute body mass
		index (BMI) print is user weak, fat or obese
		(Hint BMI = weight(kg )/ (height*height )(m
		BMI<20 weak
		20<BMI<25
		healthy
		25<BMI<30 fat
		Over 30 obese
	 */

	public static void main(String[] args) {
		
		
		int weight = 70;
		int height = 175;
		
		int BMI = (height*2) / weight ; 
		
		System.out.println(BMI);

	}

}
