package CollegePackage;

import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {

		System.out.println("Enter Name here:"); // display string

		String newname; // declares new string variable

		try (Scanner ScanIn = new Scanner(System.in)) { // create a
			newname = ScanIn.nextLine();
			ScanIn.close();
			System.out.println("Hello " + newname); // adds together newstring
													// and
													// string variable
		}
	}

}
