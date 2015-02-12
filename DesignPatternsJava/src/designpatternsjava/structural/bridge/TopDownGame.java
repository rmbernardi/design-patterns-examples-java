package designpatternsjava.structural.bridge;

public class TopDownGame implements IGame2D 
{
	public void onUp()
	{
		System.out.println("Move north");
	}
	
	public void onDown()
	{
		System.out.println("Move south");
	}
	
	public void onLeft()
	{
		System.out.println("Move east");
	}
	
	public void onRight()
	{
		System.out.println("Move west");
	}
}
