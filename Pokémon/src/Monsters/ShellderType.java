package Monsters;

public class ShellderType extends EvolvesWithItems {
	public static final ShellderType Shellder = new ShellderType();
	
	private ShellderType()
	{
		super(90, "Shellder", ElementType.WATER, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Waterstone, MonsterType.Cloyster.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Shellder
	}

}
