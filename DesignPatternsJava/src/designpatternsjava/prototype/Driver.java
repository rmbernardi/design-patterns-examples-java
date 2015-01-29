package designpatternsjava.prototype;

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
		
		System.out.println("Creating Bowser by cloning the prototype Friend. This is fast.");		
		Friend zelda = characterManager.createFriend();
		zelda.setName("Zelda");
	}
}
