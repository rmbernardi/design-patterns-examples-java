package designpatternsjava.prototype;

public class Monster extends BaseCharacter implements Cloneable
{
	public Monster()
	{
	}
	
	public void initialize()
	{
		try
		{
			// ... lengthy operations are done here ...			
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void draw()
	{
		
	}
	
	public Monster clone()
	{
		Monster retVal = null; 
		
		try
		{
			retVal = (Monster)super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			retVal = new Monster();
			
			// Since cloning is not supported,
			//	Do a field-by-field copy
			//	from the prototype instance.
		}
		
		return retVal; 
	}	
}
