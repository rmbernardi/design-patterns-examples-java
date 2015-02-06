import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import designpatternsjava.structural.adapter.Friend;
import designpatternsjava.structural.adapter.Hero;
import designpatternsjava.structural.adapter.ICharacter;
import designpatternsjava.structural.adapter.Monster;
import designpatternsjava.structural.adapter.StoreKeeperAdapter;

/**
 * Example context:
 * 
 * In a fantasy role-playing game, the creators of the game
 * create different types of characters: Heroes, Monsters, and Friend.
 * 
 * After the game is released, another external team wants to
 * add a new type of character called a StoreKeeper that will
 * buy and sell items to the main character.
 *
 * Since the StoreKeeper was implemented by an external team,
 * the implementation does not follow the model used by
 * the original creators (defined by ICharacter)
 * 
 * The game draws all characters on the screen by iterating through
 * a for-each loop of ICharacter.
 * 
 * So, in order for the StoreKeeper type to be plugged into the 
 * game, the StoreKeeper must be adapted to fit with the 
 * ICharacter interface.
 * 
 */
public class AdapterTest 
{
	@Test
	public void test() 
	{
		List<ICharacter> characters = new ArrayList<ICharacter>();
		
		Hero hero1 = new Hero();
		hero1.setName("Mario");
		characters.add(hero1);
		
		Hero hero2 = new Hero();
		hero2.setName("Luigi");
		characters.add(hero2);
		
		Monster monster1 = new Monster();
		monster1.setName("Bowser");
		characters.add(monster1);
		
		Friend friend1 = new Friend();
		friend1.setName("Sonic");
		characters.add(friend1);
		
		StoreKeeperAdapter storeKeeper1 = new StoreKeeperAdapter();
		characters.add(storeKeeper1);
		
		for (ICharacter character : characters)
		{
			System.out.println(character.toString());
		}
	}
}