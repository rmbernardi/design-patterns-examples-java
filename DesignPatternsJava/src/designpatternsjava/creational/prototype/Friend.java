package designpatternsjava.creational.prototype;

public class Friend extends BaseCharacter implements Cloneable
{
	public Friend()
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
	
	public Friend clone()
	{
		Friend retVal = null; 
		
		try
		{
			retVal = (Friend)super.clone();
		}
		catch (CloneNotSupportedException e)
		{			
			retVal = new Friend();
			
			// Since cloning is not supported,
			//	Do a field-by-field copy
			//	from the prototype instance.			
		}
		
		return retVal; 
	}		
}
