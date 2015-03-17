package Attacks;

import Monsters.ElementType;

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
	public static final Attack LightScreen = new Attack("Light Screen", 100, 0, ElementType.PSYCHIC, 30, true);
	public static final Attack Metronome = new Attack("Metronome", 100, 0, ElementType.NORMAL, 10, true);
	public static final Attack Minimize = new Attack("Minimize", 100, 0, ElementType.NORMAL, 20, true);
	public static final Attack Moonlight = new Attack("Moonlight", 100, 0, ElementType.NORMAL, 5, true);
	public static final Attack Pound = new Attack("Pound", 100, 40, ElementType.NORMAL, 40, false);
	public static final Attack Sing = new Attack("Sing", 55, 0, ElementType.NORMAL, 15, true);
	
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
}
