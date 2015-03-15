package Monsters;

public class KadabraType extends EvolvesWithTrade {

	public static final KadabraType Kadabra = new KadabraType();
	
	private KadabraType()
	{
		super(64, "Kadabra", ElementType.PSYCHIC, null);
		super.setEvolutionTarget(65);
		
		// TODO set the attack and experience details for the Kadabra
	}

}
