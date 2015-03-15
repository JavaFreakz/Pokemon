package Monsters;

public class HaunterType extends EvolvesWithTrade {

	public static final HaunterType Haunter = new HaunterType();
	
	private HaunterType()
	{
		super(93, "Haunter", ElementType.GHOST, ElementType.POISON);
		super.setEvolutionTarget(65);
		
		// TODO set the attack and experience details for the Haunter
	}

}
