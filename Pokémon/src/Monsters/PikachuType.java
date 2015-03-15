package Monsters;

public class PikachuType extends EvolvesWithItems {

	public static final PikachuType Pikachu = new PikachuType();
	
	private PikachuType()
	{
		super(25, "Pikachu", ElementType.ELECTRIC, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Thunderstone, MonsterType.Raichu.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Pikachu
	}
}
