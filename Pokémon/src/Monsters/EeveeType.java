package Monsters;

public class EeveeType extends EvolvesWithItems {

	public static final EeveeType Eevee = new EeveeType();
	
	private EeveeType()
	{
		super(133, "Pikachu", ElementType.NORMAL, null);
		
		ItemMonsterPair[] pairs = {
				new ItemMonsterPair(Item.ItemType.Waterstone, MonsterType.Vaporeon.getId()),
        		new ItemMonsterPair(Item.ItemType.Thunderstone, MonsterType.Jolteon.getId()),
				new ItemMonsterPair(Item.ItemType.Firestone, MonsterType.Flareon.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Eevee
	}

}
