package com.Topperworld.task1;
import java.util.Random;
import java.util.Scanner;


public class GuessingNumber {

	public static void main(String[] args) {
		System.out.println(" Welcome to Guess Number Game ");
		System.out.println(" You Will Be Asked To Guess A Number To Win The Game ");
		System.out.println(" You have Maximum 5 Attempts Limit .");
		Random random =new Random();
		Scanner scanner =new Scanner(System.in);
		
		int randomNumber =random.nextInt(100)+1;
		//System.out.println(" randomNumber is "+ randomNumber);
		
		int trycount=0;
		while(true) {
		System.out.println(" Enter your GUessnumber Between 1-100 : ");
		int playerGuess = scanner.nextInt();
		
		if(playerGuess==randomNumber) {
			System.out.println(" OOhhOO! ,YOUR NUMBER IS CORRECT .YOU WIN THE GAME ");
			System.out.println(" it took you "+ trycount+" tries ");
			break;
		}
		else if(randomNumber > playerGuess) {
			System.out.println("  Your Guess  Number is Greater , Guess again ");
		}
		else {
			System.out.println("Your Guess  Number is Smaller , Guess again ");
		   }
		}
		scanner.close();
	}

}
