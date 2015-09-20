package JavaTutor;
/**
 * 
 */

/**
 * @author shane
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// can be a byte , short, int , or char
		int score = 95;
		switch (score) {
		case 100: // this a set of variable to be called once.
		case 95:
		case 90:
			System.out.println("Very Good");
			break; // break out of the switch statement
		case 60:
			System.out.println("Good");
			break; // break out of the switch statement
		case 30:
			System.out.println("not Good");
			break; // break out of the switch statement
		default:
			System.out.println("the grade is not defined");
			break; // break out of the switch statement

		}

	}

}
