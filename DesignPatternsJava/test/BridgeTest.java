import org.junit.Test;

import designpatternsjava.structural.bridge.GamePadController;
import designpatternsjava.structural.bridge.IGame2D;
import designpatternsjava.structural.bridge.IGameController;
import designpatternsjava.structural.bridge.SideScrollingGame;

/**
 * Example context:
 * The author can create two different types of games:
 * side-scrolling or top-down-view games.
 * 
 * The games can be controlled using either a gamepad
 * or a keyboard.
 * 
 * Either game type must be able to work with either
 * controller type.
 *
 */
public class BridgeTest 
{
	@Test
	public void test() 
	{
		// Either type of game can be used.
//		IGame2D game = new TopDownGame();
		IGame2D game = new SideScrollingGame();
		
		// Either type of controller can be used.
		IGameController controller = new GamePadController(game);
//		IGameController controller = new KeyboardController(game);
		
		
		controller.onDown();
		controller.onUp();
		controller.onLeft();
		controller.onRight();
	}

}
