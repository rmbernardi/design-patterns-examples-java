import static org.junit.Assert.*;

import org.junit.Test;

import designpatternsjava.structural.flyweight.Bush;
import designpatternsjava.structural.flyweight.Door;
import designpatternsjava.structural.flyweight.FlowerPatch;
import designpatternsjava.structural.flyweight.GridItemFactory;
import designpatternsjava.structural.flyweight.Rock;
import designpatternsjava.structural.flyweight.Tree;

/**
 * Example context:
 * 
 * In a fantasy role-playing game, the world is composed
 * of grid items.  In the outerworld, grid items can be
 * one of the following: Bush, Door, FlowerPatch,
 * Rock, or Tree.
 * 
 * The world contains can contain hundreds or thousands of
 * Bushes, Doors, FlowerPatchs, Rocks, or Trees.
 *
 * To conserve memory, rather than allocate new heap 
 * memory for each instance of each grid item type,
 * return a reference to a single object instance.c de 
 */
public class FlyweightTest
{
	@Test
	public void test() 
	{
		// Creating the gridItemFactory could take
		//	a long time.
		System.out.println("Creating the GridItemFactory.  This takes a long time...");
		GridItemFactory gridItemFactory = new GridItemFactory();
		System.out.println("GridItemFactory created");
		
		// bush1, bush2, and bush3 point to the same object.
		//	Thus, heap memory is conserved.
		//	There could be thousands of bushes in the world.
		System.out.println("Initializing the bushes");
		Bush bush1 = (Bush)gridItemFactory.getItem("bush");
		Bush bush2 = (Bush)gridItemFactory.getItem("bush");
		Bush bush3 = (Bush)gridItemFactory.getItem("bush");
		System.out.println("All bushes initialized");
		
		// door1, door2 point to the same object.
		//	Thus, heap memory is conserved.
		//  There could be hundreds of doors in the world.
		System.out.println("Initializing the doors");
		Door door1 = (Door)gridItemFactory.getItem("door");
		Door door2 = (Door)gridItemFactory.getItem("door");
		System.out.println("All doors initialized");
		
		// flowerPatch1, flowerPatch2 point to the same object.
		//	Thus, heap memory is conserved.
		//  There could be thousands of flower patches in the world.
		System.out.println("Initializing the flowerPatches");
		FlowerPatch flowerPatch1 = (FlowerPatch)gridItemFactory.getItem("flowerPatch");
		FlowerPatch flowerPatch2 = (FlowerPatch)gridItemFactory.getItem("flowerPatch");
		System.out.println("All flower patches initialized");
		
		// rock1, rock2, rock3, and rock4 point to the same object.
		//	Thus, heap memory is conserved.
		//	There could be thousands of rocks in the world.
		System.out.println("Initializing the rocks");
		Rock rock1 = (Rock)gridItemFactory.getItem("rock");
		Rock rock2 = (Rock)gridItemFactory.getItem("rock");
		Rock rock3 = (Rock)gridItemFactory.getItem("rock");
		Rock rock4 = (Rock)gridItemFactory.getItem("rock");
		System.out.println("All rocks initialized");
		
		// tree1, tree2, tree3, tree4, tree5 point to the same object.
		//	Thus, heap memory is conserved.
		//	There could be thousands of trees in the world.
		System.out.println("Initializing the trees");
		Tree tree1 = (Tree)gridItemFactory.getItem("tree");
		Tree tree2 = (Tree)gridItemFactory.getItem("tree");
		Tree tree3 = (Tree)gridItemFactory.getItem("tree");
		Tree tree4 = (Tree)gridItemFactory.getItem("tree");
		Tree tree5 = (Tree)gridItemFactory.getItem("tree");
		System.out.println("All trees initialized");
	}
}
