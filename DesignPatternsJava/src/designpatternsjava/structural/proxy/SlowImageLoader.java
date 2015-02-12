package designpatternsjava.structural.proxy;

public class SlowImageLoader implements ImageLoader 
{
	public SlowImageLoader()
	{
	}
	
	public void load()
	{
		System.out.println("Loading a remote image. This is slow.");
		
		try
		{
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("The remote image has loaded.");
	}
}
