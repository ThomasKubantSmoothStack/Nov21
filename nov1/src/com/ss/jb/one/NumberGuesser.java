/**
 * 
 */
package com.ss.jb.one;
import java.util.Random;
import java.util.Scanner;
/**
 * @author thoma
 *
 */
public class NumberGuesser {
	public static void main(String[] args) {
		Play();
	}
	public static void Play( ) {
		boolean running = true;
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int randomNumber = random.nextInt(101);
		int numOfTries = 5;
		while(running) {
			System.out.println("Pick a number 1-100!");
			String guess = in.nextLine();
			int playerGuess = Integer.parseInt(guess);
			if(playerGuess >= randomNumber - 10 && playerGuess <= randomNumber + 10) {
				System.out.println("You won! The correct number was: " + randomNumber);
				break;
			}
			else {
				if(numOfTries == 1) {
					System.out.println("GAME OVER!");
					break;
				}
				System.out.println("Sorry, you are incorrect. You have " + numOfTries + " tries left!");
				numOfTries--;
				
			}
		}
		in.close();
	}
}
