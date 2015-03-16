package region;

public class Direction {

	public static final Direction North = new Direction(1);
	public static final Direction South = new Direction(3);
	public static final Direction East  = new Direction(2);
	public static final Direction West  = new Direction(4);
	
	private int dir = 0;
	
	private Direction() {}
	
	private Direction(final int d)
	{
		dir = d;
	}
}
