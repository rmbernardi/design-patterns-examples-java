package designpatternsjava.creational.builder;

public interface ISpaceBuilderable 
{
	public void buildSpace(int row, int column);
	public ISpaceable getSpace(int row, int column);
}
