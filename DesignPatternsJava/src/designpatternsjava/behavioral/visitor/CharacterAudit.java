package designpatternsjava.behavioral.visitor;

public class CharacterAudit implements ICharacterVisitor 
{
	private int armorLevel;
	private int footwareLevel;
	private int shieldLevel;
	private int swordLevel;
	
	public CharacterAudit()
	{
		armorLevel = 0;
		footwareLevel = 0;
		shieldLevel = 0;
		swordLevel = 0;
	}
	
	public void visit(Armor armor)
	{
		armorLevel++;
	}
	
	public void visit(Footware footware)
	{
		footwareLevel++;
	}
	
	public void visit(Shield shield)
	{
		shieldLevel++;
	}
	
	public void visit(Sword sword)
	{
		swordLevel++;
	}
	
	public void visit(ICharacter character)
	{
		System.out.println(
			"The character has: " +
				"armor level " + armorLevel + ", " +
				"footware level " + footwareLevel + ", " +
				"shield level " + shieldLevel + ", " +
				"sword level " + swordLevel);
	}
}
