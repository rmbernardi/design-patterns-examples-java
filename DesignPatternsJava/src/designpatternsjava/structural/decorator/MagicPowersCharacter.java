package designpatternsjava.structural.decorator;

public class MagicPowersCharacter extends AbstractCharacterQuality 
{
	public MagicPowersCharacter(ICharacter character)
	{
		super(character);
	}
	
	@Override
	public String toString()
	{
		return "MagicPowersCharacter";
	}
}
