package Monsters;

public class JigglypuffType extends EvolvesWithItems {

	public static final JigglypuffType Jigglypuff = new JigglypuffType();
	
	private JigglypuffType()
	{
		super(39, "Jigglypuff", ElementType.NORMAL, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Moonstone, MonsterType.Wigglytuff.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Jigglypuff
	}

}
