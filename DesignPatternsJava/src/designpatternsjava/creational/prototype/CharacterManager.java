package designpatternsjava.creational.prototype;

public class CharacterManager 
{
	// These are the prototype instances.
	private Hero hero;
	private Monster monster;
	private Friend friend;
	
	public CharacterManager()
	{
		hero = new Hero();
		monster = new Monster();
		friend = new Friend();	
		
		// These operations take a long time.
		//	We only want to do these when the
		//	first prototype instance is created.
		hero.initialize();
		monster.initialize();
		friend.initialize();
	}
	
	public Hero createHero()
	{
		// Return a copy of the prototype Hero.
		return hero.clone();
	}
	
	public Monster createMonster()
	{
		// Return a copy of the prototype Monster.
		return monster.clone();
	}
	
	public Friend createFriend()
	{
		// Return a copy of the prototype Friend.
		return friend.clone();
	}
}
