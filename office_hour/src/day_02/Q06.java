package day_02;

import java.util.Random;
import java.util.Scanner;

public class Q06 {
	
	public static void main(String[] args) {
	
	Random rnd = new Random();
    Scanner scan = new Scanner(System.in);
    
    int playerScore= 0;
    int computerScore = 0;
    do {
		int num = rnd.nextInt(2); //0 rock, 1 paper, 2 scissors
		System.out.println("Please enter R, P or S");
		String s = scan.next();
		if ((s.equalsIgnoreCase("r")&&num==0)||(s.equalsIgnoreCase("p")&&num==1)||(s.equalsIgnoreCase("s")&&num==2)) {
			System.out.println("It is a tie");				
		}
		if ((s.equalsIgnoreCase("r")&&num==2)||(s.equalsIgnoreCase("p")&&num==0)||(s.equalsIgnoreCase("s")&&num==1)) {
			System.out.println("Great! You won this round. Play more to win the game");
			playerScore++;
		}
		if ((s.equalsIgnoreCase("r")&&num==1)||(s.equalsIgnoreCase("p")&&num==2)||(s.equalsIgnoreCase("s")&&num==0)) {
			System.out.println("Sorry:( You lost this round. Play more to win the game");
			computerScore++;			
		}
	} while(playerScore<5 && computerScore<5);
	
	if(playerScore== 5)System.out.println("You won five rounds and the game");
	else System.out.println("You could only won " +playerScore +"games an lost the game");
	
	scan.close();
}

}
