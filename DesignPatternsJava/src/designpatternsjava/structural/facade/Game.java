package designpatternsjava.structural.facade;

public class Game implements IGame 
{
	public void setupDrawingContext()
	{
		System.out.println("Setting up the drawing context...");
	}
	
	public void establishNetworkConnection()
	{
		System.out.println("Establishing the network connection...");
	}
	
	public void checkForUpdates()
	{
		System.out.println("Checking for updates...");
	}
	
	public void initializeWorld()
	{
		System.out.println("Initializing the world map...");		
	}
	
	public void loadPlayerData()
	{
		System.out.println("Loading player data from the database or file...");
	}
	
	public void loadGraphicalAssets()
	{
		System.out.println("Loading the image assets...");
	}
}
