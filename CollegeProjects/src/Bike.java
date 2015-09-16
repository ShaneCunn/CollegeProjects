
public class Bike {

	private String ownerName; // data member
	
	//constructor	
	public Bike() 
	{
		ownerName =  "Unassigned";
				
	}
	
	// returns the name of this bike's owner
	public String getOwnerName(){ 
	
		return ownerName;
	}
	
	//assigns the name of this bike owner
	public void setOwnerName(String name)
	{	
		ownerName = name;	
		
	}	

}
