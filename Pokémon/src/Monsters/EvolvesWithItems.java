package Monsters;

import java.util.ArrayList;
import java.util.List;

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

	public static final EvolvesWithItems Pikachu   = new EvolvesWithItems(25, "Pikachu", ElementType.ELECTRIC, null);

	private EvolvesWithItems(int id, String nam, ElementType elem1,
			ElementType elem2, int becomes, int lvlAt) {
		super(id, nam, elem1, elem2, becomes, lvlAt);
		
	}
	
	protected EvolvesWithItems(int id, String nam, ElementType elem1, ElementType elem2)
	{
		super(id, nam, elem1, elem2, -1, 100);
	}
	
	protected void setEvolutions(ItemMonsterPair[] triggerResults)
	{
		for (ItemMonsterPair itm : triggerResults) 
		{
			evolutionItems.add(itm);
		}
	}

}
