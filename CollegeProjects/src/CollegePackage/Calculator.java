package CollegePackage;
import  java.util.Scanner; //import scanner that read in system in

public class Calculator {
	public static void main(String[] args) {
		Scanner Cal = new Scanner(System.in);
		
		double fnum, snum, answer; // 3 double varible
		
		System.out.println("Enter the first number:");
		fnum = Cal.nextDouble(); //stores first number			
		System.out.println("Enter the second number:");
		snum = Cal.nextDouble(); // store the second number		
		answer = fnum + snum; // add toget the first and second numbers
		System.out.println(answer); // outputs the answer variable to screen
			
		
	}
}
