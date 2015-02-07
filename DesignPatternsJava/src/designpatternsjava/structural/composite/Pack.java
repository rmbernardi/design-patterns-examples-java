package designpatternsjava.structural.composite;

import java.util.Hashtable;

/**
 * Note that this class uses the type Player
 * 	rather than the type Individual.
 *
 */
public class Pack extends Player 
{
	Hashtable<String, Player> members =
		new Hashtable<String, Player>();
	
	
	public Pack(int health, int strength, String name)
	{
		super(health, strength, name);
	}
	
	// For simplicity, duplicates are not handled.
	
	public void AddMember(Player individual)
	{
		// Add a member to the Pack.
		members.put(individual.getName(), individual);
	}
	
	public void RemoveMember(Player individual)
	{
		// Remove a member from the Pack
		members.remove(individual.getName());
	}
	
	public Player GetMember(Player individual)
	{
		// Get a member from the pack.
		return members.get(individual.getName());
	}
	
	/**
	 * List the pack's name and individual members.
	 */
	@Override
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Pack name: " + name + "\n");
		
		for (String key : members.keySet())
		{
			buffer.append("Member: " + members.get(key) + "\n");
		}
		
		return buffer.toString();
	}
}
