package designpatternsjava.structural.bridge;

public class KeyboardController extends AbstractController 
{
	public KeyboardController(IGame2D game)
	{
		super(game);
	}
	
	public void onLeft()
	{
		System.out.println("Player typed 'L'");
		game.onLeft();
	}
	
	public void onRight()
	{
		System.out.println("Player typed 'J'");
		game.onRight();
	}
	
	public void onUp()
	{
		System.out.println("Player typed 'I'");
		game.onUp();
	}
	
	public void onDown()
	{
		System.out.println("Player typed 'K'");
		game.onDown();
	}
}
