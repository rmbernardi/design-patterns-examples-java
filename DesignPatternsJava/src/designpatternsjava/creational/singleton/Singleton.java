package designpatternsjava.creational.singleton;

/**
 * Example context:
 * 
 * In this example, only a single instance of an
 * class is created.
 * 
 * The constructor of the Singleton cannot be directly
 * called.  The instance of the Singleton must be 
 * obtained through the getInstance() method.
 * 
 * The example shows that all calls to the getInstance()
 * method result in a reference to the original Singleton
 * object.
 *
 */
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
