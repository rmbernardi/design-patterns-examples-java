package designpatternsjava.behavioral.visitor;

public class ArsenalItem 
{
	private Integer level;
	
	public ArsenalItem()
	{
		level = 0;
	}
	
	public Integer getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	// Avoiding methods such as incrementLevel
	//	and decrementLevel. Visitors need direct
	//	access to the fields.  This avoids changing the
	//	inheritance hierarchy here.  
	//	This centralized changes to the Visitor classes only.
	
	// Do NOT put this here!
//	public void incrementLevel()
//	{
//		level++;
//	}
		
	// Do not put there here!
//	public void decrementLevel()
//	{
//		level--;
//	}
}
