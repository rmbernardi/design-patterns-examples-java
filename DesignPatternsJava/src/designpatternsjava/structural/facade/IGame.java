package designpatternsjava.structural.facade;

public interface IGame 
{
	public void setupDrawingContext();
	public void checkForUpdates();
	public void initializeWorld();
	public void loadPlayerData();
	public void loadGraphicalAssets();
}
