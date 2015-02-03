package designpatternsjava.creational.factorymethod;

public abstract class AbstractCollectableFactory 
{
	public ICollectable build(ExperienceLevel experienceLevel)
	{
		return select(experienceLevel);
	}
	
	// This is the "factory" method.
	//	Since it is protected, clients cannot directly
	//	decide which type of Collectable to create.
	protected abstract ICollectable select(ExperienceLevel level);
}
