package designpatternsjava.structural.decorator;

public class IncreasedStrengthCharacter extends AbstractCharacterQuality 
{
	public IncreasedStrengthCharacter(ICharacter character)
	{
		super(character);
	}
	
	@Override
	public String toString()
	{
		return "IncreasedStrengthCharacter";
	}
}
