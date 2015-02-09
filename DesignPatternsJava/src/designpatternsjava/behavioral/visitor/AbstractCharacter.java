package designpatternsjava.behavioral.visitor;

// See the adapter example.
// Though this file has no abstract methods, it must still
//	be abstract since the draw method cannot be implemented
//	here.
public abstract class AbstractCharacter implements ICharacter
{
	protected int strength;
	protected int health;	
	protected String name;
	
	private Armor armor;
	private Footware footware;
	private Shield shield;
	private Sword sword;
	
	public AbstractCharacter()
	{
		this.strength = 0;
		this.health = 0;
		this.name = "";
		
		initialize();
	}
	
	public AbstractCharacter(int strength, int health, String name)
	{
		this.strength = strength;
		this.health = health;
		this.name = name;
		
		initialize();
	}
	
	private void initialize()
	{
		armor = new Armor();
		footware = new Footware();
		shield = new Shield();
		sword = new Sword();		
	}
	
	public void setStrength(int strength)
	{
		this.strength = strength;
	}
	
	public int getStrength()
	{
		return strength;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{		
		armor.acceptCharacterVisitor(visitor);
		footware.acceptCharacterVisitor(visitor);
		shield.acceptCharacterVisitor(visitor);
		sword.acceptCharacterVisitor(visitor);		
	}
}
