package designpatternsjava.creational.factorymethod;

public class ShieldFactory extends AbstractCollectableFactory 
{	
	public ICollectable select(ExperienceLevel experienceLevel)
	{
		ICollectable retVal = null;
		
		// If new experience levels or shield types 
		//	are added later, then the code in this file
		//	will need to change.
		if (experienceLevel == ExperienceLevel.Neophyte)
		{
			retVal = new PlasticShield();
		}
		else if (experienceLevel == ExperienceLevel.Experienced)
		{
			retVal = new WoodShield();
		}
		else if (experienceLevel == ExperienceLevel.Master)
		{
			retVal = new MetalShield();
		}		
		
		return retVal;
	}	
}
