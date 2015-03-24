package Monsters;
 
public class ElementType {
	
	public static final ElementType BUG = new ElementType("Bug");
	public static final ElementType DRAGON = new ElementType("Dragon");
	public static final ElementType ELECTRIC = new ElementType("Electric");
	public static final ElementType FIGHTING = new ElementType("Fighting");
	public static final ElementType FIRE = new ElementType("Fire");
	public static final ElementType FLYING = new ElementType("Flying");
	public static final ElementType GHOST = new ElementType("Ghost");
	public static final ElementType GRASS = new ElementType("Grass");
	public static final ElementType GROUND = new ElementType("Ground");
	public static final ElementType ICE = new ElementType("Ice");
	public static final ElementType NORMAL = new ElementType("Normal");
	public static final ElementType POISON = new ElementType("Poison");
	public static final ElementType PSYCHIC = new ElementType("Psychic");
	public static final ElementType ROCK = new ElementType("Rock");
	public static final ElementType WATER = new ElementType("Water");
	
	private String element;
	private ElementType[] weakAgainst;
	private ElementType[] superAgainst;
	private ElementType[] noEffect;
	
	private ElementType() {}
	
	private ElementType(String name)
	{
		element = name;
	}
	
	private void setInteractions(ElementType[] weaknesses, ElementType[] supers, ElementType[] cantHit)
	{
		int i = 0;
		weakAgainst = new ElementType[weaknesses.length];
		for(ElementType typ : weaknesses)
		{
			weakAgainst[i++] = typ;
		}

		i = 0;
		superAgainst = new ElementType[supers.length];
		for(ElementType typ : supers)
		{
			superAgainst[i++] = typ;
		}

		i = 0;
		noEffect = new ElementType[cantHit.length];
		for(ElementType typ : cantHit)
		{
			noEffect[i++] = typ;
		}
	}
	
	public static void initialize()
	{
		ElementType[] bugWeaknesses  = {ElementType.ROCK, ElementType.FLYING, ElementType.POISON};
		ElementType[] bugStrengths = {ElementType.GRASS, ElementType.PSYCHIC};
		ElementType[] bugCantHit = {};
		BUG.setInteractions(bugWeaknesses, bugStrengths, bugCantHit);
		
		ElementType[] dragonWeaknesses  = {};
		ElementType[] dragonStrengths = {ElementType.DRAGON};
		ElementType[] dragonCantHit = {};
		DRAGON.setInteractions(dragonWeaknesses, dragonStrengths, dragonCantHit);

		ElementType[] electricWeaknesses  = {ElementType.ELECTRIC, ElementType.GRASS, ElementType.DRAGON};
		ElementType[] electricStrengths = {ElementType.FLYING, ElementType.WATER};
		ElementType[] electricCantHit = {ElementType.GROUND};
		ELECTRIC.setInteractions(electricWeaknesses, electricStrengths, electricCantHit);

		ElementType[] fightingWeaknesses  = {ElementType.POISON, ElementType.FLYING, ElementType.PSYCHIC, ElementType.BUG};
		ElementType[] fightingStrengths = {ElementType.NORMAL, ElementType.ICE};
		ElementType[] fightingCantHit = {ElementType.GHOST};
		FIGHTING.setInteractions(fightingWeaknesses, fightingStrengths, fightingCantHit);

		ElementType[] flyingWeaknesses  = {ElementType.ELECTRIC, ElementType.ROCK};
		ElementType[] flyingStrengths = {ElementType.BUG, ElementType.FIGHTING, ElementType.GRASS};
		ElementType[] flyingCantHit = {};
		FLYING.setInteractions(flyingWeaknesses, flyingStrengths, flyingCantHit);

		ElementType[] fireWeaknesses  = {ElementType.WATER, ElementType.FIRE, ElementType.ROCK, ElementType.DRAGON};
		ElementType[] fireStrengths = {ElementType.GRASS, ElementType.BUG, ElementType.ICE};
		ElementType[] fireCantHit = {};
		FIRE.setInteractions(fireWeaknesses, fireStrengths, fireCantHit);

		ElementType[] ghostWeaknesses  = {ElementType.WATER, ElementType.FIRE, ElementType.ROCK, ElementType.DRAGON};
		ElementType[] ghostStrengths = {ElementType.GHOST, ElementType.PSYCHIC};
		ElementType[] ghostCantHit = {ElementType.FIGHTING, ElementType.NORMAL};
		GHOST.setInteractions(ghostWeaknesses, ghostStrengths, ghostCantHit);

		ElementType[] grassWeaknesses  = {ElementType.FIRE, ElementType.GRASS, ElementType.POISON, ElementType.FLYING, ElementType.BUG, ElementType.DRAGON};
		ElementType[] grassStrengths = {ElementType.WATER, ElementType.GROUND, ElementType.ROCK};
		ElementType[] grassCantHit = {};
		GRASS.setInteractions(grassWeaknesses, grassStrengths, grassCantHit);

		ElementType[] groundWeaknesses  = {ElementType.GRASS, ElementType.BUG};
		ElementType[] groundStrengths = {ElementType.ELECTRIC, ElementType.FIRE, ElementType.POISON, ElementType.ROCK};
		ElementType[] groundCantHit = {ElementType.FLYING};
		GROUND.setInteractions(groundWeaknesses, groundStrengths, groundCantHit);

		ElementType[] iceWeaknesses  = {ElementType.FIRE, ElementType.ICE, ElementType.WATER};
		ElementType[] iceStrengths = {ElementType.FLYING, ElementType.DRAGON, ElementType.GRASS, ElementType.GROUND};
		ElementType[] iceCantHit = {};
		ICE.setInteractions(iceWeaknesses, iceStrengths, iceCantHit);

		ElementType[] normalWeaknesses  = {ElementType.ROCK};
		ElementType[] normalStrengths = {};
		ElementType[] normalCantHit = {ElementType.GHOST};
		NORMAL.setInteractions(normalWeaknesses, normalStrengths, normalCantHit);

		ElementType[] poisonWeaknesses  = {ElementType.ROCK, ElementType.POISON, ElementType.GROUND, ElementType.GHOST};
		ElementType[] poisonStrengths = {ElementType.GRASS};
		ElementType[] poisonCantHit = {};
		POISON.setInteractions(poisonWeaknesses, poisonStrengths, poisonCantHit);

		ElementType[] psychicWeaknesses  = {ElementType.PSYCHIC};
		ElementType[] psychicStrengths = {ElementType.FIGHTING, ElementType.POISON};
		ElementType[] psychicCantHit = {};
		PSYCHIC.setInteractions(psychicWeaknesses, psychicStrengths, psychicCantHit);

		ElementType[] rockWeaknesses  = {ElementType.FIGHTING, ElementType.GROUND};
		ElementType[] rockStrengths = {ElementType.FLYING, ElementType.ICE, ElementType.FIRE, ElementType.BUG};
		ElementType[] rockCantHit = {};
		ROCK.setInteractions(rockWeaknesses, rockStrengths, rockCantHit);

		ElementType[] waterWeaknesses  = {ElementType.WATER, ElementType.GRASS, ElementType.DRAGON};
		ElementType[] waterStrengths = {ElementType.GROUND, ElementType.FIRE, ElementType.ROCK};
		ElementType[] waterCantHit = {};
		WATER.setInteractions(waterWeaknesses, waterStrengths, waterCantHit);
	}
	
	public String getName()
	{
		return element;
	}
	
	public boolean isWeakAgainst(ElementType type)
	{
		for (ElementType tgtType : weakAgainst)
		{
			if (type == tgtType) return true;
		}
		return false;
	}
	
	public boolean isSuperAgainst(ElementType type)
	{
		for (ElementType tgtType : superAgainst)
		{
			if (type == tgtType) return true;
		}
		return false;
	}
	
	public boolean canHit(ElementType type)
	{
		for (ElementType tgtType : noEffect)
		{
			if (type == tgtType) return false;
		}
		return true;	
	}
}
