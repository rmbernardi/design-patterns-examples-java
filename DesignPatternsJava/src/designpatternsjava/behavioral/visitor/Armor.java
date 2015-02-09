package designpatternsjava.behavioral.visitor;

public class Armor extends ArsenalItem implements IVisitable
{
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{
		visitor.visit(this);
	}
}
