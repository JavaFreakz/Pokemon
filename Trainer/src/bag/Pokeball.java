package bag;

import region.Location.TerrainType;
import Monsters.Monster;

public class Pokeball {

	private int tries = 0;
	protected float ballModifier = (float) 1.0;
	
	public boolean throwIt(Monster target, TerrainType whereAmI)
	{
		float statusModifier = (float) 1;;
		switch(target.getStatus())
		{
		case NO_STATUS_CONDITION: 
			statusModifier = (float) 1.0;
			break;
		case FROZEN:
		case SLEEP:
			statusModifier =  (float) 2.0;
			break;
		case PARALYZED:
		case BURNED:
		case POISONED:
			statusModifier =  (float) 1.5;
			break;
		}
		int catchValue = (int) ((( 3 * target.getNormalHealth() - 2 * target.getHealth() ) * 
				(255 /*catchRate?*/ * ballModifier ) / (3 * target.getHealth()) ) * statusModifier);
		
		if (catchValue == 255) return true;
		
		// not an outright catch, so try up to four times (throw and 3 shakes)
		for (tries = 0; tries < 4; tries++)
		{
			float caught = (float) (1048560 / Math.sqrt(Math.sqrt(16711680 / catchValue)));
			if (caught < Math.random()) return false;
		}
		return true;
	}
	
	public int getNumberShakes()
	{
		return tries;
	}
}
