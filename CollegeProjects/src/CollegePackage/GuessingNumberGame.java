package CollegePackage;

import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		
		
		int secretNumber;
		secretNumber = (int) (Math.random()*10);
		System.out.println("Secert number is " + secretNumber);
		
		Scanner keyboard = new Scanner(System.in);
		int deducted;
		System.out.println("enter a guess: ");
		deducted = keyboard.nextInt();
		System.out.println("your guess is " + deducted);
		
		
		
		
	}

}
