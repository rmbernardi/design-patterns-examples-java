import static org.junit.Assert.*;

import org.junit.Test;

import designpatternsjava.creational.singleton.Singleton;


public class SingletonTest 
{

	@Test
	public void test() 
	{
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.counter);
		
		singleton = Singleton.getInstance();
		System.out.println(singleton.counter);
		
		// Note that the second println produces the result 1;
	}

}
