package designpatternsjava.behavioral.visitor;

public class CharacterDiagnostics implements ICharacterVisitor 
{
	public void visit(Armor armor)
	{
		System.out.println("Diagnosing the armor");
	}	
	
	public void visit(Footware footware)
	{
		System.out.println("Diagnosing the footware");
	}
	
	public void visit(Shield shield)
	{
		System.out.println("Diagnosing the shield");
	}

	public void visit(Sword sword)
	{
		System.out.println("Diagnosing the sword");
	}
	
	public void visit(ICharacter character)
	{
		System.out.println("Diagnosing the character");
	}
}
