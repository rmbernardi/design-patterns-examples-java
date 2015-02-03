package designpatternsjava.creational.singleton;

public class Driver 
{
	public static void main(String args[])
	{
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.counter);
		
		singleton = Singleton.getInstance();
		System.out.println(singleton.counter);
		
		// Note that the second println produces the result 1;
	}
}
