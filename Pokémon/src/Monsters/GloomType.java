package Monsters;

public class GloomType extends EvolvesWithItems {

	public static final GloomType Gloom = new GloomType();
	
	private GloomType()
	{
		super(44, "Gloom", ElementType.GRASS, ElementType.POISON);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Leafstone, MonsterType.Vileplume.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the GloomType
	}

}
