package region;

import java.util.HashMap;
import java.util.Map;

public class LeagueMap {
	
	public Location StartLocation = new Location(0,0,0);
	public Direction StartDirection = Direction.East;

	private Map<String, Location> locations = new HashMap<>(); 
	
	
	public static String getLocationId(int x, int y, int z)
	{
		return String.valueOf(
				z * 10000000 +
				x * 10000 +
				y);
	}
	
	public Location getLocation(int x, int y, int z) 
	{
		return locations.get(getLocationId(x, y, z));
	}
}
