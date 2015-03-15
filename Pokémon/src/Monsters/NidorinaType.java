package Monsters;

public class NidorinaType extends EvolvesWithItems {

	public static final NidorinaType Nidorina = new NidorinaType();
	
	private NidorinaType()
	{
		super(30, "Nidorina", ElementType.POISON, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Moonstone, MonsterType.Nidoqueen.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Nidorina
	}
}