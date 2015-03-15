package Monsters;

public class EvolvesWithTrade extends MonsterType {

	/**
	 * Override of superclass ctor, which should never be used.
	 * @param id - Pokemon number
	 * @param nam - Name 
	 * @param elem1 - first elemental type
	 * @param elem2 - second elemental type
	 * @param becomes - what this pokemon can evolve into. Because Eevee and others can
	 *                  evolve into multiple targets, that is why this ctor is inappropriate
	 * @param lvlAt - level at which this pokemon can evolve. Again, not applicable.
	 */
	private EvolvesWithTrade(int id, String nam, ElementType elem1,
			ElementType elem2, int becomes, int lvlAt) {
		super(id, nam, elem1, elem2, becomes, lvlAt);
		
	}
	
	protected EvolvesWithTrade(int id, String nam, ElementType elem1, ElementType elem2)
	{
		super(id, nam, elem1, elem2, -1, 100);
		super.evolutionTrigger =  EvolutionType.TRADE;
	}

	protected void setEvolutionTarget(int tgtId)
	{
		super.evolvesInto = tgtId;
	}
}
