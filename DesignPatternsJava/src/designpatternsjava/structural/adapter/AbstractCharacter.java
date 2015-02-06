package designpatternsjava.structural.adapter;

public abstract class AbstractCharacter implements ICharacter
{
	protected int strength;
	protected int health;	
	protected String name;
	
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
}
