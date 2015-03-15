package Monsters;

public class VulpixType extends EvolvesWithItems {

	public static final VulpixType Vulpix = new VulpixType();
	
	private VulpixType()
	{
		super(37, "Vulpix", ElementType.FIRE, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Firestone, MonsterType.Ninetales.getId())};
		
		super.setEvolutions(pairs);
		
		// TODO set the attack and experience details for the Vulpix
	}

}
