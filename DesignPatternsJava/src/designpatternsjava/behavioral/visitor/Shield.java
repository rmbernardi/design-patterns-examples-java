package designpatternsjava.behavioral.visitor;

public class Shield implements IVisitable 
{
	public void acceptCharacterVisitor(ICharacterVisitor visitor)
	{
		visitor.visit(this);
	}
}
