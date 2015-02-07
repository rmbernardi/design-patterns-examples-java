package designpatternsjava.structural.composite;

public class Individual extends Player
{
	public Individual(int health, int strength, String name)
	{
		super(health, strength, name);
	}
	
	public void AddMember(Player player)
	{
		// Leave this empty.
	}
	
	public void RemoveMember(Player player)
	{
		// Leave this empty.
	}
	
	public Player GetMember(Player Player)
	{
		return null;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
