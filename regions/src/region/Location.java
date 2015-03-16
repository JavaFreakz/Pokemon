package region;

public class Location {

	private int x;
	private int y;
	private int z;
	
	public enum TerrainType {
		Grass,
		Pavement,
		Doorway,
		Water,
		Tree,
		Building,
		Ladder,
		Cave
	}
	
	private Location() {}
	
	public Location(final int xpos, final int ypos, final int level)
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
