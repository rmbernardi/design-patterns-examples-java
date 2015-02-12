package designpatternsjava.structural.proxy;

public class Proxy 
{
	// This is similar to Singleton
	private SlowImageLoader slowLoader = null;
	
	public Proxy()
	{
		System.out.println("Creating the proxy");
	}
	
	public void load()
	{
		if (slowLoader == null)
		{
			slowLoader = new SlowImageLoader();
		}
		
		slowLoader.load();
		
		// Could start the slow loader in a separate thread.
		//	When the slow loader completes, could have
		//	a callback which would swap the slow loader
		//	with the fast loader.
	}
}
