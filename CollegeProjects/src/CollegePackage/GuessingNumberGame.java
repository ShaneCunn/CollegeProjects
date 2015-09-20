package CollegePackage;

import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {

		// to do fix comments

		// Declares Variables
		int secretNumber;
		secretNumber = (int) (Math.random() * 1000 + 1); // generates a random
															// number
		// System.out.println("Secret number is " + secretNumber);

		// Declares and creates a scanner object
		try (Scanner keyboard = new Scanner(System.in)) {

			int guess = 0;
			int attempts = 0; // sets attempts variable to zero
			boolean isNumber;

			do {
				// get input from user
				System.out.print("Enter a guess (1-1000): ");

				do {
					if (keyboard.hasNextInt(10)) {
						guess = keyboard.nextInt(10); // limits input to a integer
						isNumber = true;
					} else {

						System.out.println("Please enter a number between 1-1000"); //
						isNumber = false; // flips isnumber boolean to false
						keyboard.next();// empty scanner in and asks for a
										// number

					}

				} while (!(isNumber));
				System.out.println("Your guess is " + guess);

				if (guess < secretNumber) // if the number is lower it prints
											// out
					System.out.println("Your guess is smaller than the secret number.");
				if (guess > secretNumber) // if the number is higher it print
											// out
					System.out.println("Your number is larger than the secret number.");

				// keeps going till the right number is guessed

				attempts++; // adds +1 to the attempts variable

			} while (guess != secretNumber && attempts < 7);
			/*
			 * while attempts are less than seven it keeps looping seven times
			 * and the system exits if there are seven wrong attempts.
			 */

			if (guess == secretNumber) {
				System.out.println("Your guess is correct, well done");

			} else {
				System.out.println("You tried incorrectly 7 times!!!, The correct number was: " + secretNumber); // i

			}
		}

	}

}
