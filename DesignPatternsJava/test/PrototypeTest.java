import static org.junit.Assert.*;

import org.junit.Test;

import designpatternsjava.creational.prototype.CharacterManager;
import designpatternsjava.creational.prototype.Friend;
import designpatternsjava.creational.prototype.Hero;
import designpatternsjava.creational.prototype.Monster;

/**
 * Example context:
 * 
 * In this example, characters for a fantasy role-playing game
 * are created.  The characters are classified as Heros,
 * Friends, and Monsters.
 * 
 * Instantiation and initialization of characters
 * can take a long time.
 * 
 * Only during the initialization phase of the program
 * are the prototype characters instantiated.  Thereafter,
 * new characters are created by cloning the prototypes.
 * 
 * This way, creation of new characters on-the-fly is 
 * much quicker.
 */
public class PrototypeTest 
{
	@Test
	public void test() 
	{
		System.out.println("Creating the CharacterManager. This takes a long time.");
		CharacterManager characterManager = new CharacterManager();
		
		System.out.println("Creating Mario by cloning the prototype Hero. This is fast.");
		Hero mario = characterManager.createHero();
		mario.setName("Mario");
		
		System.out.println("Creating Luigi by cloning the prototype Hero. This is fast.");		
		Hero luigi = characterManager.createHero();
		luigi.setName("Luigi");
		
		System.out.println("Creating Bowser by cloning the prototype Monster. This is fast.");		
		Monster bowser = characterManager.createMonster();
		bowser.setName("Bowser");
		
		System.out.println("Creating Zelda by cloning the prototype Friend. This is fast.");		
		Friend zelda = characterManager.createFriend();
		zelda.setName("Zelda");
	}

}
