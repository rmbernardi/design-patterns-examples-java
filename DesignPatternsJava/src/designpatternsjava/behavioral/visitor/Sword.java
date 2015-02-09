package designpatternsjava.behavioral.visitor;

public class Sword extends ArsenalItem implements IVisitable 
{
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{
		visitor.visit(this);
	}
}
