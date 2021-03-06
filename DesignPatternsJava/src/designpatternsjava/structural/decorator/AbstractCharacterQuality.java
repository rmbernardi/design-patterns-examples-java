package designpatternsjava.structural.decorator;

public abstract class AbstractCharacterQuality extends AbstractCharacter  
{
	protected ICharacter decoratedCharacter;
	
	public AbstractCharacterQuality(ICharacter character)
	{
		decoratedCharacter = character;
	}
}
