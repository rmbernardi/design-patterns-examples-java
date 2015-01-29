package designpatternsjava.prototype;

public class Hero extends BaseCharacter
{	
	public Hero()
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
	
	public Hero clone()
	{
		Hero retVal = null; 
		
		try
		{
			retVal = (Hero)super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			retVal = new Hero();
			
			// Since cloning is not supported,
			//	Do a field-by-field copy
			//	from the prototype instance.
		}
		
		return retVal; 
	}
}
