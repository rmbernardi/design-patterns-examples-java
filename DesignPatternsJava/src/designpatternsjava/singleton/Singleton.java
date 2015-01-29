package designpatternsjava.singleton;

public class Singleton 
{
	protected static Singleton _instance = null;
	public int counter;
	
	protected Singleton()
	{
		counter++;
	}
	
	public static Singleton getInstance()
	{
		if (_instance == null)
		{
			_instance = new Singleton();
		}
		
		return _instance;
	}
}
