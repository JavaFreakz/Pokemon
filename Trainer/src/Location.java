
public class Location {

	private int x;
	private int y;
	private int z;
	
	private Location() {}
	
	private Location(final int xpos, final int ypos, final int level)
	{
		x = xpos;
		y = ypos;
		z = level;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getLevel()
	{
		return z;
	}
}
