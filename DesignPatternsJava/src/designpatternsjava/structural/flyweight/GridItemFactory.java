package designpatternsjava.structural.flyweight;

import java.util.Hashtable;

public class GridItemFactory 
{
	Hashtable<String, IGridItemable> items = 
		new Hashtable<String, IGridItemable>();
	
	public GridItemFactory()
	{
		items.put("bush", new Bush());
		items.put("door", new Door());
		items.put("flowerPatch", new FlowerPatch());
		items.put("rock", new Rock());
		items.put("tree", new Tree());
	}
	
	public IGridItemable getItem(String type)
	{
		return items.get(type);
	}
}
