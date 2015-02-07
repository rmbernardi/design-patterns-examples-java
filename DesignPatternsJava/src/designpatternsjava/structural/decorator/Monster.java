package designpatternsjava.structural.decorator;

public class Monster extends AbstractMonster
{
	public Monster(/* ICharacter character */)
	{
//		super(character);
	}
	
	@Override
	public String toString()
	{
		return "Monster";
	}
}
