package JavaSquare;

import java.util.Scanner;

public class Cannon {

	//String soldierName;
	
	public String soldier;
	
	
	public Cannon(String soldier) {
	this.soldier = soldier;
	System.out.println("Soldier " + soldier);
	
	}

	private void fire() {

		String fire = "Fire!";
		System.out.println(fire);
	}
	
	private String reload(){
		String reloadOutput = "reloading...";
		return reloadOutput;
	}
	
	
	private String misfire(){
		return "misfire!";
		
	}
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String soldier = scan.nextLine();
		Cannon objCannon = new Cannon(soldier);
		System.out.println(objCannon.reload());
		System.out.println(objCannon.reload());		
		System.out.println(objCannon.reload());
		objCannon.fire();
		

	}

}
