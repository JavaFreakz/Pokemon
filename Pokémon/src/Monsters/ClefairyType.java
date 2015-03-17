package Monsters;

import java.util.ArrayList;
import java.util.List;

import Attacks.Attack;
import Attacks.AttackLevel;

public class ClefairyType extends EvolvesWithItems {

	public static final ClefairyType Clefairy = new ClefairyType();
	
	private ClefairyType()
	{
		super(35, "Clefairy", ElementType.NORMAL, null);
		
		ItemMonsterPair[] pairs = {new ItemMonsterPair(Item.ItemType.Moonstone, MonsterType.Clefable.getId())};
		
		super.setEvolutions(pairs);
		
		List<AttackLevel> att = new ArrayList<>();
		att.add(new AttackLevel(Attack.Pound, 1));
		att.add(new AttackLevel(Attack.Growl, 1));
		att.add(new AttackLevel(Attack.Encore, 1));
		att.add(new AttackLevel(Attack.Sing, 13));
		att.add(new AttackLevel(Attack.Doubleslap, 18));
		att.add(new AttackLevel(Attack.Minimize, 24));
		att.add(new AttackLevel(Attack.Metronome, 31));
		att.add(new AttackLevel(Attack.DefenseCurl, 39));
		//att.add(new AttackLevel(Attack.Moonlight, 43));  // not in RBY
		att.add(new AttackLevel(Attack.LightScreen, 53));
		
		super.setAttackList(att);
		
		//TODO set up possible TMs and HMs
	}

}
