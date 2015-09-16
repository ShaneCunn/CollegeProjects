package CollegePackage;

import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		
		// Declares Variables
		int secretNumber;
		secretNumber = (int) (Math.random()*1000 + 1);
		//System.out.println("Secret number is " + secretNumber);
		
		
		//Declares and creates a scanner object
		try (Scanner keyboard = new Scanner(System.in))
		{
		
		
		int guess;
		int attempts = 0;
		
			do {
				// get input from user
				System.out.println("Enter a guess (1-1000): ");
				guess = keyboard.nextInt();
				System.out.println("Your guess is " + guess);				
				
				
				if (guess == secretNumber)
					System.out.println("Your guess is correct, well done");
				else if (guess < secretNumber)
					System.out.println("Your guess is smaller than the secret number.");
				else if (guess > secretNumber)
					System.out.println("Your number is larger than the secret number.");
				
				
				// keeps going till the right number is guessed
				attempts++;
				} while (guess != secretNumber && attempts < 7);
			
			if(guess == secretNumber){
				System.out.println("Your guess is correct, well done");				
				
			}
			else{
				System.out.println("You tried incorrectly 7 times!!!");
				
			}
		}	
		
		
	}

}
