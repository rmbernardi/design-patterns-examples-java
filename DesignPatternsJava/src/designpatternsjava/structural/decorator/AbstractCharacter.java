package designpatternsjava.structural.decorator;

public abstract class AbstractCharacter implements ICharacter 
{
	private int health = 0;
	private int strength = 0;
	private int magic = 0;
	
	public AbstractCharacter()
	{
	}
	
	public int getHealth()	
	{ 
		return this.health;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public int getStength()
	{
		return this.strength;
	}
	
	public int setStrength()
	{
		return health;
	}
	
	public int getMagic()
	{
		return this.magic;
	}
	
	public void setMagic(int magic)
	{
		this.magic = magic;
	}
}
