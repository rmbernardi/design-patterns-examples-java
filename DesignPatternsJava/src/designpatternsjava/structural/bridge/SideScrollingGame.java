package designpatternsjava.structural.bridge;

public class SideScrollingGame implements IGame2D 
{ 
	public void onUp()
	{
		System.out.println("Jump");
	}
	
	public void onDown()
	{
		System.out.println("Squat");
	}
	
	public void onLeft()
	{
		System.out.println("Move left");
	}
	
	public void onRight()
	{
		System.out.println("Move right");
	}
}
