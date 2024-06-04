 package java_Project;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberGuessing {

	public static void main(String[] args) {
 
		Random r1 = new Random();  // Random Class
		int num = r1.nextInt(100);  // Generate random number from 1 to 100
		int attempts = 8;   // Max Attempts
		int rounds = 5;     // Rounds
		int count = 1;      // attempts_count
		int won = 0;        // Rounds Won
		int round_count = 1;  
		int max_score = 100;  // Max_Score
		int score = 0;
		
 		System.out.println();
		System.out.println("------------------------Welcome to Number Guessing Game------------------------");
		System.out.println();
		System.out.println();
		System.out.println("**********Ready to play the game !**********");
		System.out.println();
		System.out.println("# You will have " + attempts + " attempts to guess the correct number.");
		System.out.println("# For winning the game , You have to score at least half of total points.");
		System.out.println("# The Number will be between 1 to 100. Best of Luck !");
		System.out.println();
		System.out.println();
		 
		Scanner sc = new Scanner(System.in);
		
		while(rounds <= 5) {
		
			if(attempts == 0) {
				System.out.println();
				System.out.println("You Lose the Round !!! Play again");
				System.out.println("The Actual Number is :  " + num);
				System.out.println("------------------------------------------------");
				round_count++;
			}
			
			if(round_count == 1) {
				System.out.println("------------------------------------------------");
				System.out.println("**********First Round**********");
				System.out.println("------------------------------------------------");
			}
			 
			if(round_count == 2) {
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("**********Second Round**********");
				System.out.println("------------------------------------------------");
				num = r1.nextInt(100);
				attempts = 8;
				count = 1;
			}
			
			if(round_count == 3) {
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("**********Third Round**********");
				System.out.println("------------------------------------------------");
				num = r1.nextInt(100);
				attempts = 8;
				count = 1;
			}
			
			if(round_count == 4) {
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("**********Fourth Round**********");
				System.out.println("------------------------------------------------");
				num = r1.nextInt(100);
				attempts = 8;
				count = 1;
			}
			
			if(round_count == 5) {
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("**********Final Round**********");
				System.out.println("------------------------------------------------");
				num = r1.nextInt(100);
				attempts = 8;
				count = 1;
			}
			
			if(round_count > 5) {
				break;
			}
			
			  while(attempts > 0) {	
				  
				System.out.println();
	 			System.out.print("Guess the number :  ");
	 			int guessNum = sc.nextInt();
				if(guessNum == num) {
					System.out.println();
					System.out.println("Congratulations !");
					System.out.println("You Guessed the Correct number in " + count + " attempts");
					System.out.println("------------------------------------------------");
					System.out.println();
					score += 20;     // Each Round max_score is 20 points
					won++;
					round_count++;
					break;
				} else if(guessNum >= num + 30) {
					System.out.println();
					System.out.println("Too High ! Think Lower");
					System.out.println("Try Again !   " + --attempts + " attempts left");
					System.out.println("------------------------------------------------");
					System.out.println();
					count++;
				} else if(guessNum <= num - 30) {
					System.out.println();
					System.out.println("Too Low ! Think bigger");
					System.out.println("Try Again !  " + --attempts + " attempts left");
					System.out.println("------------------------------------------------");
					System.out.println();
					count++;
				} else if(guessNum >= num - 5 && guessNum <= num + 5) {
					System.out.println();
					System.out.println("Very Close ! Almost there");
					System.out.println("Try Again !  " + --attempts + " attempts left");
					System.out.println("------------------------------------------------");
					System.out.println();
					count++;
				} else if(guessNum >= num - 10 && guessNum <= num + 10) {
					System.out.println();
					System.out.println("Close ! Just nailed it");
					System.out.println("Try Again !  " + --attempts + " attempts left");
					System.out.println("------------------------------------------------");
					System.out.println();
					count++;
				} else {
					System.out.println();
					System.out.println("Nearly there ! A little here or there");
					System.out.println("Try Again !  " + --attempts + " attempts left");
					System.out.println("------------------------------------------------");
					System.out.println();
					count++;
				}
			}
		}
		       System.out.println();
		       System.out.println("------------------------------------------------");
		       System.out.println("**********Game Over !**********");
		       System.out.println("------------------------------------------------");
		       System.out.println();
		       
		        if(score >= 50) {
		        	System.out.println();
		        	System.out.println("------------------------------------------------");
		        	System.out.println("Congratulations , You Won the Game !!!");
		        	System.out.println("You won " + won + " rounds.");
		        	System.out.println("You have Scored " + score + " out of " + max_score + " points");
		        	System.out.println("------------------------------------------------");
		        	System.out.println();
		        } else {
		        	System.out.println();
		        	System.out.println("You Lose the Game !!! , Better luck next time.");
		        	System.out.println("You have Scored " + score + " out of " + max_score + " points");
		        	System.out.println("------------------------------------------------");
		        	System.out.println();
		        }
		    
 		
	}

}
