package designpatternsjava.behavioral.visitor;

public interface IVisitable 
{
	void acceptCharacterVisitor(ICharacterVisitor visitor);
}
