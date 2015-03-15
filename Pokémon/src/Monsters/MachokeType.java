package Monsters;

public class MachokeType extends EvolvesWithTrade {

	public static final MachokeType Machoke = new MachokeType();
	
	private MachokeType()
	{
		super(67, "Machoke", ElementType.FIGHTING, null);
		super.setEvolutionTarget(65);
		
		// TODO set the attack and experience details for the Machoke
	}

}
