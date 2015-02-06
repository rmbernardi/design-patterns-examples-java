package designpatternsjava.structural.adapter;
 
public class StoreKeeperAdapter extends StoreKeeper implements ICharacter 
{
	public int getStrength()
	{
		return hitPoints;
	}
	
	public int getHealth()
	{
		return remainingEnergy;
	}
	
	public String getName()
	{
		return "StoreKeeper";
	}
	
	public void draw()
	{
		// ... omitted ...
	}
}
