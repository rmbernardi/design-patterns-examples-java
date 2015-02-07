import org.junit.Test;

import designpatternsjava.structural.decorator.ICharacter;
import designpatternsjava.structural.decorator.Hero;
import designpatternsjava.structural.decorator.IncreasedStrengthCharacter;
import designpatternsjava.structural.decorator.InvisibilityCloakCharacter;
import designpatternsjava.structural.decorator.MagicPowersCharacter;

/**
 * In a fantasy role-playing game,
 * the hero can have earn various types of
 * qualities during the game.
 *
 */
public class DecoratorTest 
{
	@Test
	public void test() 
	{
		ICharacter mainCharacter = new Hero();
		System.out.println(mainCharacter);
		
		// Give increased strength to the hero...
		mainCharacter = new IncreasedStrengthCharacter(mainCharacter);
		System.out.println(mainCharacter);
		
		// Give an invisibility cloak to the hero...
		// Note: The code in this example does not support
		//	giving increased strength AND an invisibility cloak.
		mainCharacter = new InvisibilityCloakCharacter(mainCharacter);
		System.out.println(mainCharacter);
		
		// Give magical powers to the character...
		// Note: The code in this example does not support
		//	give an invisibility cloak AND magical powers.
		mainCharacter = new MagicPowersCharacter(mainCharacter);		
		System.out.println(mainCharacter);		
	}

}
