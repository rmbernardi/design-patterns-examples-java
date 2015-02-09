package designpatternsjava.behavioral.visitor;

public class Footware extends ArsenalItem implements IVisitable 
{
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{
		visitor.visit(this);
	}
}
