package almelojavachallenges;

import java.util.Scanner;

public class IfElseSesHizi {

public static void main(String[] args) {
	
	/*
	 Kullanici mesafeyi veriyor ve buna gore ses hizinin 3 farkli ortamdaki
	 ulasma hizini buluyoruz
	 Bu da Time=distance/1100 air second *1100 ve diger degerler programciya 
	 verilmis saatteki degerleri
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance");
		double distance = sc.nextDouble();
		
		System.out.println("Give enviroment of sound");
		String environment = sc.next();

		
		
		if(environment.equalsIgnoreCase("air")) {
			System.out.println("Time in air:" + (distance / 1100)+" second");
		}
		if(environment.equalsIgnoreCase("water")) {
			System.out.println("Time in air:" + (distance / 4900)+" second");
		}
		if(environment.equalsIgnoreCase("steel")) {
			System.out.println("Time in air:" + (distance / 16400)+" second");
		}
		sc.close();

	}

}
