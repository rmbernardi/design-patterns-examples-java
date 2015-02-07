package designpatternsjava.structural.decorator;

public class InvisibilityCloakCharacter extends AbstractCharacterQuality 
{
	public InvisibilityCloakCharacter(ICharacter character)
	{
		super(character);
	}
	
	@Override
	public String toString()
	{
		return "InvisibilityCloakCharacter";
	}
}
