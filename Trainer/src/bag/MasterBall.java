package bag;

import region.Location.TerrainType;
import Monsters.Monster;

public class MasterBall extends Pokeball {

	public MasterBall()
	{
		super.ballModifier = (float) 100;
	}

	@Override
	public boolean throwIt(Monster target, TerrainType loc)
	{
		return true;
	}
}
