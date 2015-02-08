import org.junit.Test;

import designpatternsjava.behavioral.visitor.CharacterDiagnostics;
import designpatternsjava.behavioral.visitor.CharacterAudit;
import designpatternsjava.behavioral.visitor.Hero;
import designpatternsjava.behavioral.visitor.ICharacter;


/**
 * Example context:
 *
 * In a fantasy role-playing game, there exist 
 * different types of main characters.
 *
 */
public class VisitorTest 
{
	@Test
	public void test() 
	{
		// Create an engine...
		ICharacter zelda = new Hero();
		
		System.out.println("Running an audit on the character");
		zelda.acceptCharacterVisitor(new CharacterAudit());
		
		System.out.println();
		
		System.out.println("Running diagnostics on the character");
		zelda.acceptCharacterVisitor(new CharacterDiagnostics());
	}
}
