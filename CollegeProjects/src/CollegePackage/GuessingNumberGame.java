package CollegePackage;

import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		
		
		int secretNumber;
		secretNumber = (int) (Math.random()*1000 + 1);
		//System.out.println("Secert number is " + secretNumber);
		
		
		
		try (Scanner keyboard = new Scanner(System.in))
		{
		
		
		int guess;
		
		do {
		System.out.println("Enter a guess (1-1000): ");
		guess = keyboard.nextInt();
		System.out.println("Your guess is " + guess);
		
		
		
		if (guess == secretNumber)
			System.out.println("Your guess is correct, well done");
		else if (guess < secretNumber)
			System.out.println("Your guess is smaller than the secret number.");
		else if (guess > secretNumber)
			System.out.println("Your number is larger than the secret number.");
		} while (guess != secretNumber);
		
		
		}
		
		
		
		
	}

}
