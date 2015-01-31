package designpatternsjava.factorymethod;

/**
 * Example context:
 * 
 * In a role-playing game, a character
 * can collect various weapons and shields.
 * 
 * As the character advances through the game, she
 * gains experience points.  As the character gains
 * more experience points, the character advances through the
 * various stages of growth from neophyte, to experienced,
 * to master.
 * 
 * Depending on the amount of experience points the character
 * has gained, the types of weapons and shields that the
 * character can obtain improve.
 * 
 * A "neophyte" character, can only have a wood sword and a wood shield.
 * An "experienced" character, can have a plastic sword and a plastic shield.
 * A "master" character, can have a metal sword and a metal shield.
 * 
 * @author Bob
 *
 */
public class Driver 
{
	public static void main(String args[])
	{
		ExperienceLevel experienceLevel = ExperienceLevel.Neophyte;
		
		WeaponFactory weaponFactory = new WeaponFactory();
		ShieldFactory shieldFactory = new ShieldFactory();
		
		// Based on the experience level, the factories
		//	will automatically determine the correct type of
		//	collectables to create.
		//
		// This class does not know what kinds of weapons or shields
		//	will be constructed.
		ICollectable weapon = weaponFactory.build(experienceLevel);		
		ICollectable shield = shieldFactory.build(experienceLevel);
		
		System.out.println(shield.toString());
		System.out.println(weapon.toString());
	}
}
