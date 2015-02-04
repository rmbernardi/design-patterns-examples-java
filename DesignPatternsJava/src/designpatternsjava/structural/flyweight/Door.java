package designpatternsjava.structural.flyweight;

public class Door implements IGridItemable 
{
	public Door()
	{
		try
		{
			// ... this could take a long time ...
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void draw()
	{
		System.out.println("Rendering a Door");
	}
}
