package designpatternsjava.structural.flyweight;

public class FlowerPatch implements IGridItemable 
{
	public FlowerPatch()
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
		System.out.println("Rendering a Flower Patch");
	}
}
