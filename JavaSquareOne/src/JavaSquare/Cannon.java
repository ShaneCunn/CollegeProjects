package JavaSquare;

import java.util.Scanner;

public class Cannon {

	String soldierName;
	public Cannon(String soldier) {
	soldierName = soldier;
	System.out.println("Soldier " + soldierName);
	
	}

	private void fire() {

		String fire = "Fire!";
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String soldier = scan.nextLine();
		Cannon objCannon = new Cannon(soldier);

	}

}
