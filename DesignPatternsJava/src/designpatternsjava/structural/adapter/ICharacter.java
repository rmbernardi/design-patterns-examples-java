package designpatternsjava.structural.adapter;

// Variables declared in an interface are
//	final. Thus, their values would be
//	immutable.

// So, declare accessors here and put the
//	variables into the derived classes.

// This class was defined by the original creators of the game.
public interface ICharacter 
{
	public int getStrength();
	public int getHealth();
	
	public String getName();
	
	public void draw();
}
