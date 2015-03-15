package Monsters;

import java.util.ArrayList;
import java.util.List;

import Attacks.Attack;
import Monsters.MonsterType.EvolutionType;

public class EvolvesWithItems extends MonsterType {
	
	public class ItemMonsterPair {
		public Item.ItemType item;
		public int monster;
		
		public ItemMonsterPair(Item.ItemType itm, int target) {
			item = itm;
			monster = target;
		}
	}
	
	private List<ItemMonsterPair> evolutionItems = new ArrayList<>();

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
	private EvolvesWithItems(int id, String nam, ElementType elem1,
			ElementType elem2, int becomes, int lvlAt) {
		super(id, nam, elem1, elem2, becomes, lvlAt);
		
	}
	
	protected EvolvesWithItems(int id, String nam, ElementType elem1, ElementType elem2)
	{
		super(id, nam, elem1, elem2, -1, 100);
		super.evolutionTrigger =  EvolutionType.ITEM;
	}
	
	protected void setEvolutions(ItemMonsterPair[] triggerResults)
	{
		for (ItemMonsterPair itm : triggerResults) 
		{
			evolutionItems.add(itm);
		}
	}

	protected void setAttackList(List<Attack> atts)
	{
		super.setAttacks(atts);
	}
}
