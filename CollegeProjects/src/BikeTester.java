
public class BikeTester {

	public static void main(String[] args) {
		Bike  bike1, bike2;
		String  owner1, owner2;
		
		bike1 = new Bike(); // declares and creates a bike object
		bike1.setOwnerName("Shane Cunningham"); // assign a value to bike1
		
		bike2 = new Bike(); //Declare and Create object 
		bike2.setOwnerName("John McQuillian"); // assign a value to bike2
		
		//outs info on the 2 bikes
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		
		System.out.println(owner1 + " owns a bicyle");
		System.out.println(owner2 + " Also owns a bike");

	}

}
