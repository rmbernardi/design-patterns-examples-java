package designpatternsjava.structural.flyweight;

public class Rock implements IGridItemable 
{
	public Rock()
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
		System.out.println("Rendering a Rock");
	}
}
