package designpatternsjava.structural.facade;

public class GameFacade 
{
	private IInternetConnection connection;
	private IGame game;
	private IGameController controller;
	
	public void initialize()
	{
		connection = new InternetConnection();
		connection.initialize();
		
		game = new Game();
		game.setupDrawingContext();
		game.checkForUpdates();
		game.initializeWorld();
		game.loadPlayerData();
		game.loadGraphicalAssets();
		
		controller = new XBoxOneController();
		controller.setup();		
	}
}
