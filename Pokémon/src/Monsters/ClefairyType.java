package Monsters;

import java.util.ArrayList;
import java.util.List;

import Attacks.Attack;

public class ClefairyType extends EvolvesWithItems {

	public static final ClefairyType Clefairy = new ClefairyType();
	
	private ClefairyType()
	{
		super(35, "Clefairy", ElementType.NORMAL, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Moonstone, MonsterType.Clefable.getId())};
		
		super.setEvolutions(pairs);
		
		List<Attack> att = new ArrayList<>();
		att.add(Attack.Pound);
		//TODO   add the rest of the attacks here
		
		super.setAttackList(att);
	}

}
