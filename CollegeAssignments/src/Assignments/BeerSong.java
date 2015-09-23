package Assignments;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		

		for (beerNum = 99; beerNum > 0; beerNum--) {  // while beerNum is 99 it decreases the counter by 1
			System.out.println(beerNum + " " + word + " of beer on the wall"); // print out the value of beerNum and word
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
		}
		if (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall");
		}

		else {
			System.out.println("No more bottles of beer on the wall"); // if beerNum is 0 it prints this
		}
	}
}