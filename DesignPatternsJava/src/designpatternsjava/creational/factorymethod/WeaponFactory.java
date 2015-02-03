package designpatternsjava.creational.factorymethod;

public class WeaponFactory extends AbstractCollectableFactory
{	
	public ICollectable select(ExperienceLevel experienceLevel)
	{
		AbstractWeapon retVal = null;
		
		// If new experience levels or weapon types
		//	are added, then this file must change.
		if (experienceLevel == ExperienceLevel.Neophyte)
		{
			retVal = new PlasticSword();
		}
		else if (experienceLevel == ExperienceLevel.Experienced)
		{
			retVal = new WoodSword();
		}
		else if (experienceLevel == ExperienceLevel.Master)
		{
			retVal = new MetalSword();
		}		
		
		return retVal;
	}	
}
