package designpatternsjava.behavioral.visitor;

public interface ICharacterVisitor 
{
	public void visit(Armor armor);
	public void visit(Footware footware);
	public void visit(Shield shield);
	public void visit(Sword sword);
}
