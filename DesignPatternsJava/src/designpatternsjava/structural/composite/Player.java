package designpatternsjava.structural.composite;

public abstract class Player 
{
	protected int health;
	protected int strength;
	protected String name;
	
	public Player(int health, int strength, String name)
	{
		this.health = health;
		this.strength = strength;
		this.name = name;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public int getStrength()
	{
		return this.strength;
	}
	
	public void setStrength(int strength)
	{
		this.strength = strength;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	// Note: The arguments are of type Player, not Individual
	public abstract void AddMember(Player player);
	public abstract void RemoveMember(Player Player);
	public abstract Player GetMember(Player player);
}
