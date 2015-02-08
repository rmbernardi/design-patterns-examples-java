package designpatternsjava.behavioral.visitor;

public class Sword implements IVisitable 
{
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{
		visitor.visit(this);
	}
}
