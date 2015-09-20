package JavaSquare;

import java.util.Arrays;

public class Operators {

	public static void main(String[] args) {
		int firstInt = 20;
		int secondInt = 10;
		int add;
		int minus;
		int division;
		int multi;
			
		// Arithmetic operators: +,-,/,*
		add = firstInt + secondInt;		
		minus = firstInt - secondInt;
		division = firstInt /secondInt;
		multi = firstInt * secondInt;
		int modulus = 5 % 4;
		
		int[] results = new int[4];
		
		results[0] = add;
		results[1] = minus;
		results[2] = division;
		results[3] = multi;
		String converted = Arrays.toString(results);
		System.out.println(converted);
		
		String[] animals = {"Dogs","Cats","Cows","Sheep",};
		
		String animalsString = Arrays.toString(animals);
		System.out.println();
		
		

	}

}
