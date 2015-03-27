package Attacks;

import java.util.ArrayList;
import java.util.List;

import Monsters.ElementType;
import Monsters.Monster;

public class AbsorbAttack extends Attack {

	public static final Attack Absorb = new AbsorbAttack();
	
	private AbsorbAttack()
	{
		super("Absorb", 100, 20, ElementType.GRASS, 20, true);
	}
	
	@Override
	public void perform(Monster initiatorMonster, Monster targetMonster)
	{
		// Default is to try and hit the target, taking into account accuracy, type of
		// attack, type of initiator, type of target, target evasiveness
		
		float willHit = (float) (accuracy * targetMonster.getEvasive()) / (float) 10000;
		if (willHit < 1.0)    // only use random if not 100% (or better)
		{
			// use random to determine the success.
			willHit = (float) (willHit * Math.random()); 
			if (willHit <= .5) return; // a miss if below half, hit if greater than half
		}
		
		// How much damage?. Get multipliers (initiator type, attack type, target type)
		ElementType t1Type = initiatorMonster.getType().getElement1();
		ElementType t2Type = initiatorMonster.getType().getElement2();
		
		float multiplier = (float) 1.0;
		if (t1Type != ElementType.NORMAL && 
			t1Type == type)
			multiplier *= 1.5;   // STAB strength when the attack type matches user's
	    if (t2Type != ElementType.NORMAL &&
	    	t2Type == type)
	    	multiplier *= 1.5;   // second user's monster type matches the attack type
	    
	    // Normal can't hit ghost, psychic can't hit dark, electric can't hit ground,
	    // ground can't hit flying, etc.
		t1Type = targetMonster.getType().getElement1();
		t2Type = targetMonster.getType().getElement2();
		List<ElementType> tgtTypes = new ArrayList<>();
		tgtTypes.add(t1Type);
		if (t2Type != null) tgtTypes.add(t2Type);
		
		for (ElementType tgtType : tgtTypes)
		{
			if (tgtType.canHit(type))
			{
				if(type.isSuperAgainst(tgtType))
					multiplier *= (float) 2.0;  // super doubles the strength
				if (type.isWeakAgainst(tgtType))
					multiplier *= (float) 0.5;  // weak halves the strength
			}
			else
			{
				multiplier = (float) 0.0; //no effect if can't hit
				break;
			}
		}
		
		//  calculate battle damage and apply to the target's HP
		int defense =  targetMonster.getDefense();
		int attack = initiatorMonster.getAttack();
		
		if (isSpecial) 
		{
			defense = targetMonster.getSpecialDefense();
			attack = initiatorMonster.getSpecialAttack();
		}
		
		int lvl = initiatorMonster.getLevel();
		float random = (float) (85 + Math.random()*15);
		float damage = (((((2*lvl/5+2)*attack*power/defense)/50) +2)*multiplier*random/100);
		int hit = (int) damage;
		
		targetMonster.addHealth(-hit);
		initiatorMonster.addHealth(hit/5);
	}
}
