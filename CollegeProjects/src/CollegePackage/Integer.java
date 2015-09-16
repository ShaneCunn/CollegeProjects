package CollegePackage;
import  java.util.Scanner; //import scanner that read in system in
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// added a try to close the scanner
		try (Scanner single = new Scanner(System.in)) 
			{
			int lads, girls, people;
				lads = 6;
				girls= 3;
				people = lads + girls;
				System.out.println("The is Total: " + people);
		}

	}

}
