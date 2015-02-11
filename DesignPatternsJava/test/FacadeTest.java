import static org.junit.Assert.*;

import org.junit.Test;

import designpatternsjava.structural.facade.GameFacade;

/**
 * Example context:
 * 
 * A game requires several initialization steps when it is
 * 	started including setting up the graphics context,
 *  loading graphical resources, establishing the 
 *  network connecting, connecting to game controllers, etc.
 *  
 *  To simplify the API for the clients, all of these
 *  steps are abstracted behind a facade.
 *
 */
public class FacadeTest 
{
	@Test
	public void test() 
	{
		GameFacade game = new GameFacade();
		game.initialize();
	}

}
