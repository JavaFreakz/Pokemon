package Monsters;

public class MonsterType {
	
	public static final MonsterType Bulbasaur = new MonsterType(1, "Bulbasaur", ElementType.GRASS, null, 2, 16);
	public static final MonsterType Ivysaur   = new MonsterType(2, "Ivysaur",   ElementType.GRASS, null, 3, 32);
	public static final MonsterType Venusaur  = new MonsterType(3, "Venusaur",  ElementType.GRASS, null, -1, 100);
	public static final MonsterType Charmander = new MonsterType(4, "Charmander", ElementType.FIRE, null, 5, 16);
	public static final MonsterType Charmeleon   = new MonsterType(5, "Charmeleon",   ElementType.FIRE, null, 6, 36);
	public static final MonsterType Charizard  = new MonsterType(6, "Charizard",  ElementType.FIRE, null, -1, 100);
	public static final MonsterType Squirtle = new MonsterType(7, "Squirtle", ElementType.WATER, null, 8, 16);
	public static final MonsterType Wartortle   = new MonsterType(8, "Wartortle",   ElementType.WATER, null, 9, 36);
	public static final MonsterType Blastoise  = new MonsterType(9, "Blastoise",  ElementType.WATER, null, -1, 100);
	public static final MonsterType Caterpie = new MonsterType(10, "Caterpie", ElementType.BUG, null, 11, 7);
	public static final MonsterType Metapod   = new MonsterType(11, "Metapod",   ElementType.BUG, null, 12, 10);
	public static final MonsterType Butterfree  = new MonsterType(12, "Butterfree",  ElementType.BUG, ElementType.FLYING, -1, 100);
	public static final MonsterType Weedle = new MonsterType(13, "Weedle", ElementType.BUG, ElementType.POISON, 14, 7);
	public static final MonsterType Kakuna   = new MonsterType(14, "Kakuna",   ElementType.BUG, ElementType.POISON, 15, 10);
	public static final MonsterType Beedrill  = new MonsterType(15, "Beedrill",  ElementType.BUG, ElementType.POISON, -1, 100);
	public static final MonsterType Pidgey = new MonsterType(16, "Pidgey", ElementType.NORMAL, ElementType.FLYING, 17, 18);
	public static final MonsterType Pidgeotto   = new MonsterType(17, "Pidgeotto", ElementType.NORMAL,   ElementType.FLYING, 18, 32);
	public static final MonsterType Pidgeot  = new MonsterType(18, "Pidgeot", ElementType.NORMAL,  ElementType.FLYING, -1, 100);
	public static final MonsterType Rattata   = new MonsterType(19, "Rattata",   ElementType.NORMAL, null, 20, 20);
	public static final MonsterType Raticate  = new MonsterType(20, "Raticate",  ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Spearow   = new MonsterType(21, "Spearow", ElementType.NORMAL,   ElementType.FLYING, 22, 20);
	public static final MonsterType Fearow  = new MonsterType(22, "Fearow", ElementType.NORMAL,  ElementType.FLYING, -1, 100);
	public static final MonsterType Ekans   = new MonsterType(23, "Ekans", ElementType.POISON,   null, 24, 22);
	public static final MonsterType Arbok  = new MonsterType(24, "Arbok", ElementType.POISON,  null, -1, 100);
	public static final MonsterType Pikachu   = new MonsterType(25, "Pikachu", ElementType.ELECTRIC,   null, -1, 1);
	public static final MonsterType Raichu  = new MonsterType(26, "Raichu", ElementType.ELECTRIC,  null, -1, 100);
	
	public enum EvolutionType {
		LEVEL_UP,
		FRIENDSHIP,
		ITEM,
		NONE
	}
	
	private String name;
	private int evolvesInto;
	private int levelUpAt;
	private ElementType type2;
	private ElementType type;
	private int number;
	private MonsterAttack[] attackList;
	private EvolutionType evolutionTrigger;
	private Item.ItemType evolutionItem;
	
	public int getNumber()
	{
		return number;
	}
	
	private MonsterType() {}
	
	protected MonsterType(int id, String nam, ElementType elem1, ElementType elem2,int becomes, int lvlAt)
	{
		number = id;
		name = nam;
		type = elem1;
		type2 = elem2;
		evolvesInto = becomes;
		levelUpAt = lvlAt;
		evolutionTrigger = EvolutionType.LEVEL_UP;  // default.
	}
	
	public void setAttack(int attackId, MonsterAttack att)
	{
		if (attackId < 4)
		{
			attackList[attackId] = att;
		}
	}
	
	public static void initialize()
	{
		//TODO: add attacks/levels for bulbasaur and ivysaur
		
		//TODO: add attacks/levels for all remaining pokemon types
		Venusaur.evolutionTrigger =  EvolutionType.NONE;
		
		Charizard.evolutionTrigger =  EvolutionType.NONE;
		
		Blastoise.evolutionTrigger =  EvolutionType.NONE;
		
		Butterfree.evolutionTrigger =  EvolutionType.NONE;
		
		Beedrill.evolutionTrigger =  EvolutionType.NONE;
		
		Pidgeot.evolutionTrigger =  EvolutionType.NONE;
		
		Raticate.evolutionTrigger =  EvolutionType.NONE;
		
		Fearow.evolutionTrigger =  EvolutionType.NONE;
		
		Arbok.evolutionTrigger =  EvolutionType.NONE;
		
		Pikachu.evolutionTrigger =  EvolutionType.ITEM;
		Pikachu.evolutionItem = Item.ItemType.Thunderstone;
	}
}
