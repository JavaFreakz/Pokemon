package Attacks;

import java.util.ArrayList;
import java.util.List;

import Monsters.ElementType;
import Monsters.Monster;

public class Attack {
	
	public static final Attack Absorb = new Attack("Absorb", 100, 20, ElementType.GRASS, 20, true);
	public static final Attack Acid = new Attack("Acid", 100, 40, ElementType.POISON, 30, true);
	public static final Attack AcidArmor = new Attack("Acid Armor", 100, 0, ElementType.POISON, 40, true);
	public static final Attack AerialAce = new Attack("Aerial Ace", 100, 60, ElementType.FLYING, 20, false);
	public static final Attack Aeroblast = new Attack("Aeroblast", 95, 100, ElementType.FLYING, 20, true);
	public static final Attack Counter = new Attack("Pound", 100, 1, ElementType.FIGHTING, 20, false);
	public static final Attack DefenseCurl = new Attack("Defense Curl", 100, 0, ElementType.NORMAL, 40, true);
	public static final Attack Doubleslap = new Attack("Doubleslap", 85, 15, ElementType.NORMAL, 10, false);
	public static final Attack Encore = new Attack("Encore", 100, 0, ElementType.NORMAL, 5, true);
	public static final Attack Growl = new Attack("Growl", 100, 0, ElementType.NORMAL, 20, true);
	public static final Attack Growth = new Attack("Growth", 100, 0, ElementType.NORMAL, 40, true);
	public static final Attack LeechSeed = new Attack("Leech Seed", 90, 0, ElementType.GRASS, 10, true);
	public static final Attack LightScreen = new Attack("Light Screen", 100, 0, ElementType.PSYCHIC, 30, true);
	public static final Attack Metronome = new Attack("Metronome", 100, 0, ElementType.NORMAL, 10, true);
	public static final Attack Minimize = new Attack("Minimize", 100, 0, ElementType.NORMAL, 20, true);
	public static final Attack Moonlight = new Attack("Moonlight", 75, 0, ElementType.POISON, 35, true);
	public static final Attack Poisonpowder = new Attack("Poisonpowder", 100, 40, ElementType.NORMAL, 40, false);
	public static final Attack Pound = new Attack("Pound", 100, 40, ElementType.NORMAL, 40, false);
	public static final Attack RazorLeaf = new Attack("Razor Leaf", 95, 55, ElementType.GRASS, 25, true);
	public static final Attack Sing = new Attack("Sing", 55, 0, ElementType.NORMAL, 15, true);
	public static final Attack SleepPowder = new Attack("Sleep Powder", 75, 0, ElementType.GRASS, 15, true);
	public static final Attack Solarbeam = new Attack("Solarbeam", 100, 120, ElementType.GRASS, 10, false);
	public static final Attack Tackle = new Attack("Tackle", 95, 35, ElementType.NORMAL, 35, false);
	public static final Attack VineWhip = new Attack("Vine Whip", 100, 35, ElementType.GRASS, 10, false);
	
	String name;
	ElementType type;
	int power;
	int accuracy;
	boolean goesFirst;
	int defaultPP;
	boolean isSpecial;
	//SpecialEffect;
	//inUse Video;
	
	private Attack(final String nam, final int acc, final int pwr, ElementType elem, final int pp, boolean special)
	{
		name = nam;
		accuracy = acc;
		power = pwr;
		type = elem;
		defaultPP = pp;
		isSpecial = special;
	}
	
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
			multiplier *= 2.0;   // double strength when the attack type matches user's
	    if (t2Type != ElementType.NORMAL &&
	    	t2Type == type)
	    	multiplier *= 2.0;   // second user's monster type matches the attack type
	    
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
		
		// TODO calculate battle damage and apply to the target's HP
	}

}
