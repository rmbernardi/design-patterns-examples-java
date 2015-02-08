package designpatternsjava.behavioral.visitor;

public class Footware implements IVisitable 
{
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{
		visitor.visit(this);
	}
}
