package CollegePackage;

import java.util.Random;

public class random {
	public static void main(String args[]) {
		// create random object
		Random randomno = new Random();

		// check next int value
		System.out.println("Next int value: " + randomno.nextInt(10000));
	}
}
