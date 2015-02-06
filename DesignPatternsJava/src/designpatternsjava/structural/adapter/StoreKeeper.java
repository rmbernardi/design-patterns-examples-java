package designpatternsjava.structural.adapter;

// This class does not implement ICharacter
// This class was NOT created by the original creators of the game.
public class StoreKeeper
{ 
	public int hitPoints;
	public int remainingEnergy;
		
	public void buy()
	{
		// ... omitted ...
	}
	
	public void sell()
	{
		// ... omitted ...		
	}
	
	public void trade()
	{
		// ... omitted ...		
	}
	
	@Override
	public String toString()
	{
		return "StoreKeeper";
	}
}
