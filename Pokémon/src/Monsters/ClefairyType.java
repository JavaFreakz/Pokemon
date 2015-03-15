package Monsters;

public class ClefairyType extends EvolvesWithItems {

	public static final ClefairyType Clefairy = new ClefairyType();
	
	private ClefairyType()
	{
		super(35, "Clefairy", ElementType.NORMAL, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Moonstone, MonsterType.Clefable.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Clefairy
	}

}
