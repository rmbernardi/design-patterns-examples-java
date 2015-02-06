import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Example context:
 * 
 * In this example, a fantasy role-playing game contains
 * 	various dungeons as part of the game play.
 *  The main character must traverse through 
 *  each of the dungeons, battle monsters,
 *  and collect objects as they traverse through
 *  each dungeon.
 *  
 *  The layout of each dungeon is defined within
 *  text files.
 *  
 *  Each dungeon is composed of a collection of rooms.
 *  
 *  Within each room various objects can be placed 
 *  including obstacles (holes), different types of monsters,
 *  Collectables, doors, etc.
 *  
 * The initial layout of each room within each dungeon
 * 	is defined inside of text files.
 * 
 * Each row of the text file lists the location of the 
 * 	object, the type of object, and object-specific details.
 * 
 * The files can be downloaded by clients onto the local machine.
 * 
 * The contents of each file must be parsed and validated
 *  before each room of the dungeon can be created.
 *  
 * It is the responsibilty of the Builder objects to 
 * 	validate the context of each line of the files.
 * 
 * Due to this validation, the creation of each Room object
 *  must be deferred until the entire line has been read
 *  and validated.
 *  
 * A role-playing game has two different types of spaces.
 *  Each space represents an m-by-n grid of sprites.
 *  Each grid space can be part of the OuterWorld or
 *  each grid space can be part of the Underworld.
 *  Data files define how each space within each grid
 *  is defined.  
 *  In the OuterWorld, spaces can be occupied by trees,
 *  rocks, doors, and other sprites.
 *  In the UnderWorld, spaces can be occupied by doors,
 *  obstacles, collectables, and other sprites.
 */
public class BuilderTest 
{
	// The contents of the file should be inside of 
	//	a separate file.  For the sake of simplicity,
	//	the contents of the file are added to the driver.
	//
	// In a real example, the contents of the file
	//	should be contained inside of a separate file. 
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}
