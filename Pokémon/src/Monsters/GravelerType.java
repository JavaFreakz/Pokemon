package Monsters;

public class GravelerType extends EvolvesWithTrade {

	public static final GravelerType Graveler = new GravelerType();
	
	private GravelerType()
	{
		super(75, "Graveler", ElementType.ROCK, ElementType.GROUND);
		super.setEvolutionTarget(65);
		
		// TODO set the attack and experience details for the Graveler
	}

}
