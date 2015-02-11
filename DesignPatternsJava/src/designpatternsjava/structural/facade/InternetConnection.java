package designpatternsjava.structural.facade;

public class InternetConnection implements IInternetConnection 
{
	public void initialize()
	{
		System.out.println("Initializing the internet connection");
	}
}
