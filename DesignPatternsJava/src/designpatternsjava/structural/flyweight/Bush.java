package designpatternsjava.structural.flyweight;

public class Bush implements IGridItemable
{
	public void Bush()
	{
		// ... this could take a long time ...
		try
		{
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void draw()
	{
		System.out.println("Rendering a bush");
	}
}
