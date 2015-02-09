package designpatternsjava.behavioral.visitor;

// See the adapter example.
// Though this file has no abstract methods, it must still
//	be abstract since the draw method cannot be implemented
//	here.
public abstract class AbstractCharacter implements ICharacter
{
	private Armor armor;
	private Footware footware;
	private Shield shield;
	private Sword sword;
	
	public AbstractCharacter()
	{		
		armor = new Armor();
		footware = new Footware();
		shield = new Shield();
		sword = new Sword();		
	}
		
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{		
		armor.acceptCharacterVisitor(visitor);
		footware.acceptCharacterVisitor(visitor);
		shield.acceptCharacterVisitor(visitor);
		sword.acceptCharacterVisitor(visitor);		
	}
}
