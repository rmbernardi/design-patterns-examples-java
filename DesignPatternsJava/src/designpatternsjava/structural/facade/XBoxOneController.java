package designpatternsjava.structural.facade;

public class XBoxOneController implements IGameController 
{
	public void setup()
	{
		System.out.println("Initializing the XBoxOneController...");
	}
	
	public void onNorth()
	{
		System.out.println("On North...");
	}
	
	public void onEast()
	{
		System.out.println("On East...");		
	}
	
	public void onSouth()
	{
		System.out.println("On South...");
	}
	
	public void onWest()
	{
		System.out.println("On West...");		
	}
}
