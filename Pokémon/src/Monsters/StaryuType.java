package Monsters;

public class StaryuType extends EvolvesWithItems {

	public static final StaryuType Staryu = new StaryuType();
	
	private StaryuType()
	{
		super(120, "Staryu", ElementType.WATER, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Waterstone, MonsterType.Starmie.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Staryu
	}

}
