package Monsters;

public class WeepinbellType extends EvolvesWithItems {

	public static final WeepinbellType Weepinbell = new WeepinbellType();
	
	private WeepinbellType()
	{
		super(70, "Weepinbell", ElementType.GRASS, ElementType.POISON);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Leafstone, MonsterType.Victreebel.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Weepinbell
	}
}
