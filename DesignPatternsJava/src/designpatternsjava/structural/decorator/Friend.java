package designpatternsjava.structural.decorator;

public class Friend extends AbstractFriend
{
	public Friend(/* ICharacter character */)
	{
//		super(character);
	}
	
	@Override
	public String toString()
	{
		return "Friend";
	}
}
