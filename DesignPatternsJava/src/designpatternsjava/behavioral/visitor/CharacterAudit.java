package designpatternsjava.behavioral.visitor;

/**
 * These methods access variable internal to Characters.
 * Using the Visitor pattern, changes will be localized to this class
 * and no changes will be needed inside of the Character hierarchy.
 */
public class CharacterAudit implements ICharacterVisitor 
{
	public CharacterAudit()
	{	
	}
	
	public void visit(Armor armor)
	{
		Integer armorLevel = armor.getLevel();
		
		armorLevel++;		
		armor.setLevel(armorLevel);
		System.out.println("Armor level = " + armor.getLevel());
	}
	
	public void visit(Footware footware)
	{
		Integer footwareLevel = footware.getLevel();
		
		footwareLevel++;
		footware.setLevel(footwareLevel);
		System.out.println("Footware level = " + footware.getLevel());
	}
	
	public void visit(Shield shield)
	{
		Integer shieldLevel = shield.getLevel();
		
		shieldLevel++;
		shield.setLevel(shieldLevel);
		System.out.println("Shield level = " + shield.getLevel());
	}
	
	public void visit(Sword sword)
	{
		Integer swordLevel = sword.getLevel();
		
		swordLevel++;
		sword.setLevel(swordLevel);
		System.out.println("Sword level = " + sword.getLevel());
	}
}
