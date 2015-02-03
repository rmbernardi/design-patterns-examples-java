package designpatternsjava.creational.prototype;

public abstract class BaseCharacter
{
	public String name = "";
	public int experience = 0;
	public int life = 100;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}	
	

	public abstract void initialize();
	public abstract void draw();
}
