package designpatternsjava.structural.bridge;

public abstract class AbstractController implements IGameController 
{
	public IGame2D game;
	
	public AbstractController(IGame2D game)
	{
		this.game = game;
	}
}
