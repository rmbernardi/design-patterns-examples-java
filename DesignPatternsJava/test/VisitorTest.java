import org.junit.Test;

import designpatternsjava.behavioral.visitor.CharacterAudit;
import designpatternsjava.behavioral.visitor.Hero;
import designpatternsjava.behavioral.visitor.ICharacter;


/**
 * Example context:
 *
 * In a fantasy role-playing game, the protagonist's 
 * arsenal includes armor, footware, a shield, and a sword.
 * 
 *  As the game play proceeds, the protagonist can
 *  earn increased levels of each item.
 *  
 *  The visitor pattern is used to localize changes to 
 *  each arsenal item to within classes derived from 
 *  CharacterVisitor, only.  
 *
 */
public class VisitorTest 
{
	@Test
	public void test() 
	{
		// Create an engine...
		ICharacter Yelda = new Hero();
		
		System.out.println("Checking the levels of Yelda's arsenal...");
		Yelda.acceptCharacterVisitor(new CharacterAudit());
	}
}
