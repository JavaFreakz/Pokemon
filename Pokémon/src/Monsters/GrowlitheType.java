package Monsters;

public class GrowlitheType extends EvolvesWithItems {

	public static final GrowlitheType Growlithe = new GrowlitheType();
	
	private GrowlitheType()
	{
		super(58, "Growlithe", ElementType.FIRE, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Firestone, MonsterType.Arcanine.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Growlithe
	}

}
