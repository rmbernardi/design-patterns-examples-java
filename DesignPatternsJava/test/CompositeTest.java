import org.junit.Test;

import designpatternsjava.structural.composite.Individual;
import designpatternsjava.structural.composite.Pack;
import designpatternsjava.structural.composite.Player;

/**
 * Example context:
 * 
 * In a fantasy role-playing game, the main character starts the
 * game as an individual.  As the main character encounters other 
 * characters in the game, the other characters can form 
 * an alliance with the main character.
 * 
 * From the gameplay's standpoint, the alliance is one entity 
 * and treated as a single character.  The alliance is referred 
 * to as a "Pack."
 */
public class CompositeTest 
{
	@Test
	public void test() 
	{
		Player soloPlayer = new Individual(100, 100, "Solo1");
		System.out.println(soloPlayer.toString());
		
		Player packPlayer = new Pack(100, 100, "Pack1");
		Player packPlayerMember1 = new Individual(100, 100, "PackPlayer1");
		Player packPlayerMember2 = new Individual(100, 100, "PackPlayer2");
		Player packPlayerMember3 = new Individual(100, 100, "PackPlayer3");
		
		packPlayer.AddMember(packPlayerMember1);
		packPlayer.AddMember(packPlayerMember2);
		packPlayer.AddMember(packPlayerMember3);
		
		System.out.println(packPlayer);
	}
}
