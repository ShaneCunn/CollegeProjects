import java.util.Scanner;
public class AgeClass {

	public static void main(String[] args) {
		
		// Declares Variables
		String firstname, lastname;
		int age;
		//Declares and creates a scanner object
		try (Scanner ScanIn = new Scanner(System.in)) // Fixes the resource is never closed bug
			{
		
			// get input from user
			System.out.println("Enter your first name here:"); //display string
			firstname = ScanIn.next();
			
			//
			System.out.println("Enter your last name here:"); //display string
			lastname = ScanIn.next();
			
			System.out.println("Enter your age here:"); //display string
			age = ScanIn.nextInt();
			
			System.out.println("hello " + firstname + " "+ lastname + "\n" + "Your age is " + age + "!");
		
			}
		
			
		
	}// end the main method
	
	

} // end class
