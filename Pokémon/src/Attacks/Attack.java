package Attacks;

import Monsters.ElementType;

public class Attack {
	
	public static final Attack Pound = new Attack("Pound", 100, 40, ElementType.NORMAL, false, 35);
	
	String name;
	ElementType type;
	int power;
	int accuracy;
	boolean goesFirst;
	int defaultPP;
	//SpecialEffect;
	//inUse Video;
	
	private Attack(final String nam, final int acc, final int pwr, ElementType elem, boolean is1st, final int pp)
	{
		name = nam;
		accuracy = acc;
		power = pwr;
		type = elem;
		goesFirst = is1st;
		defaultPP = pp;
	}
}
