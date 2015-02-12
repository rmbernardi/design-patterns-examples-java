package designpatternsjava.structural.bridge;

public class GamePadController extends AbstractController 
{
	public GamePadController(IGame2D game)
	{
		super(game);
	}
	
	public void onLeft()
	{
		System.out.println("Player moved left on gamepad");
		game.onLeft();
	}
	
	public void onRight()
	{
		System.out.println("Player moved right on gamepad");
		game.onRight();
	}
	
	public void onUp()
	{
		System.out.println("Player moved up on gamepad");
		game.onUp();
	}
	
	public void onDown()
	{
		System.out.println("Player moved down on gamepad");
		game.onDown();
	}
}
