package JavaSquare;

public class Types {

	public static void  main(String[] args) {
		// -2^31 to 2^31-1
		int intNumber = 1;
		double doubleNumber = 0.0;
		// \u0000 to \uffff
		char lowerCase = 'a';
		
		char a =97;
		int aValue = a;
		
		
		
		System.out.println(doubleNumber);
		System.out.println(intNumber);
		
		System.out.println("Char a: " + a);
		System.out.println("Avalue: " + aValue);
		
		Types typesObject = new Types();
		
		
		String alphabet = "ABCDE";
		String substringAlphabet = alphabet.substring(1);
		System.out.println(substringAlphabet);
		String moreAlphabet = "FGHIJK";
		String combinedAlphabet = alphabet.concat(moreAlphabet);
		// combinedAlphabet = alphabet + combinedAlphabet;
		System.out.println(combinedAlphabet);
		
		
		
				
		
		
		
		
	}
	
	
}
