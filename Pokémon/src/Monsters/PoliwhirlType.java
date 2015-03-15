package Monsters;

public class PoliwhirlType extends EvolvesWithItems {

	public static final PoliwhirlType Poliwhirl = new PoliwhirlType();
	
	private PoliwhirlType()
	{
		super(61, "Poliwhirl", ElementType.WATER, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Waterstone, MonsterType.Poliwrath.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Poliwhirl
	}
}
