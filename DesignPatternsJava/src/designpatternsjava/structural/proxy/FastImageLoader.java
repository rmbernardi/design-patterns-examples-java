package designpatternsjava.structural.proxy;

public class FastImageLoader implements ImageLoader 
{
	public FastImageLoader()
	{
	}
	
	public void load()
	{
		System.out.println("Loading a local image. This is fast.");
	}
}
