package designpatternsjava.creational.prototype;

/**
 * Example context:
 * 
<<<<<<< HEAD:DesignPatternsJava/src/designpatternsjava/creational/prototype/Driver.java
 * In this example, characters for a fantasy role-playing game
 * are created.  The characters are classified as Heros,
=======
 * In this example, characters for a role-playing game
 * are created.  The characters are classified as Heroes,
>>>>>>> origin/master:DesignPatternsJava/src/designpatternsjava/prototype/Driver.java
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
<<<<<<< HEAD:DesignPatternsJava/src/designpatternsjava/creational/prototype/Driver.java
 * 
=======
>>>>>>> origin/master:DesignPatternsJava/src/designpatternsjava/prototype/Driver.java
 *
 */
public class Driver 
{
	public static void main(String args[])
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
