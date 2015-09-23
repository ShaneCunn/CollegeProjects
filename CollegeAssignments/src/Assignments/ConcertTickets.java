package Assignments;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConcertTickets {

	public static void main(String[] args) {

		try (Scanner Cal = new Scanner(System.in)) {
			double fnum, snum, thirdnum, fourthNum, fithNum, sixNum, answer;

			// 3 double variable

			System.out.println("Enter number of A seats sold:");
			fnum = Cal.nextDouble(); // stores first number
			System.out.println("Enter price of A tickets:");
			snum = Cal.nextDouble(); // store the second number

			System.out.println("Enter number of B seats sold:");
			thirdnum = Cal.nextDouble(); // stores number
			System.out.println("Enter price of B tickets:");
			fourthNum = Cal.nextDouble(); // store the second number

			System.out.println("Enter number of C seats sold:");
			fithNum = Cal.nextDouble(); // stores first number
			System.out.println("Enter price of C tickets:");
			sixNum = Cal.nextDouble(); // store the second number

			answer = ((fnum * snum) + (thirdnum * fourthNum) + (fithNum * sixNum)); // add
																					// together
																					// the
																					// first
																					// and
																					// second
																					// numbers
			System.out.printf("Total Sales: \u20AC%.2f", answer); // uses print format to limit the output to 2 decimal places
		}// added a euro symbol

	}

}
