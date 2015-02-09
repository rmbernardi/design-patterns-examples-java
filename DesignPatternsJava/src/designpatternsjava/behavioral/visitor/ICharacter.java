package designpatternsjava.behavioral.visitor;

// Variables declared in an interface are
//	final. Thus, their values would be
//	immutable.

// So, declare accessors here and put the
//	variables into the derived classes.

// This class was defined by the original creators of the game.

// Note: In interface can extend another interface.
//	however, ICharacter cannot implement IVisitable
public interface ICharacter extends IVisitable
{
}
