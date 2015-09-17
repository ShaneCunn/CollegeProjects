package CollegePackage;

import java.util.Scanner; //import scanner that scans  IN USER input		

public class userinput {

	public static void main(String[] args) {
		// added a TRY to close the scanner
		try (Scanner Store = new Scanner(System.in)) // new variable that store
														// data from the scanner
														// in

		{
			System.out.println(Store.nextLine()); // output the store variable
													// to the screen
		}
	}

}
