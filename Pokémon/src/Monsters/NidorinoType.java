package Monsters;

public class NidorinoType extends EvolvesWithItems {

	public static final NidorinoType Nidorino = new NidorinoType();
	
	private NidorinoType()
	{
		super(33, "Nidorino", ElementType.POISON, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Moonstone, MonsterType.Nidoking.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Nidorino
	}

}
