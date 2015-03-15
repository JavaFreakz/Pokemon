package Monsters;

public class ExeggcuteType extends EvolvesWithItems {

	public static final ExeggcuteType Exeggcute = new ExeggcuteType();
	
	private ExeggcuteType()
	{
		super(102, "Exeggcute", ElementType.GRASS, ElementType.PSYCHIC);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Waterstone, MonsterType.Exeggutor.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Exeggcute
	}

}
