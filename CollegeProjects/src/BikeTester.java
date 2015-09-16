
public class BikeTester {

	public static void main(String[] args) {
		Bike  bike1, bike2;
		String  owner1, owner2;
		
		bike1 = new Bike();
		bike1.setOwnerName("Shane Cunningham");
		
		bike2 = new Bike();
		bike2.setOwnerName("John McQuillian");
		
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		
		System.out.println(owner1 + " owns a bicyle");
		System.out.println(owner2 + " Also owns a bike");

	}

}
