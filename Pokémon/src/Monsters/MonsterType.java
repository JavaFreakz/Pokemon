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
	public static final MonsterType Pikachu   = new MonsterType(25, "Pikachu", ElementType.ELECTRIC,   null, 26, 1);
	public static final MonsterType Raichu  = new MonsterType(26, "Raichu", ElementType.ELECTRIC,  null, -1, 100);
	public static final MonsterType Sandshrew   = new MonsterType(27, "Sandshrew", ElementType.GROUND,   null, 28, 22);
	public static final MonsterType Sandslash  = new MonsterType(28, "Sandslash", ElementType.GROUND,  null, -1, 100);
	public static final MonsterType NidoranF = new MonsterType(29, "NidoranF", ElementType.POISON, null, 30, 16);
	public static final MonsterType Nidorina   = new MonsterType(30, "Nidorina",   ElementType.POISON, null, 31, 100);
	public static final MonsterType Nidoqueen  = new MonsterType(31, "Nidoqueen",  ElementType.POISON, ElementType.GROUND, -1, 100);
	public static final MonsterType NidoranM = new MonsterType(32, "NidoranM", ElementType.POISON, null, 30, 16);
	public static final MonsterType Nidorino   = new MonsterType(33, "Nidorino",   ElementType.POISON, null, 31, 100);
	public static final MonsterType Nidoking  = new MonsterType(34, "Nidoking",  ElementType.POISON, ElementType.GROUND, -1, 100);
	public static final MonsterType Clefairy   = new MonsterType(35, "Clefairy",   ElementType.NORMAL, null, 36, 100);
	public static final MonsterType Clefable  = new MonsterType(36, "Clefable",  ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Vulpix   = new MonsterType(37, "Vulpix",   ElementType.FIRE, null, 38, 100);
	public static final MonsterType Ninetales  = new MonsterType(38, "Ninetales",  ElementType.FIRE, null, -1, 100);
	public static final MonsterType Jigglypuff   = new MonsterType(39, "Jigglypuff",   ElementType.NORMAL, null, 40, 100);
	public static final MonsterType Wigglytuff  = new MonsterType(40, "Wigglytuff",  ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Zubat   = new MonsterType(41, "Zubat",   ElementType.POISON, ElementType.FLYING, 42, 22);
	public static final MonsterType Golbat  = new MonsterType(42, "Golbat",  ElementType.POISON, ElementType.FLYING, -1, 100);
	public static final MonsterType Oddish = new MonsterType(43, "Oddish", ElementType.GRASS, ElementType.POISON, 44, 21);
	public static final MonsterType Gloom   = new MonsterType(44, "Gloom",   ElementType.GRASS, ElementType.POISON, 45, 100);
	public static final MonsterType Vileplume  = new MonsterType(45, "Vileplume",  ElementType.GRASS, ElementType.POISON, -1, 100);
	public static final MonsterType Paras   = new MonsterType(46, "Paras",   ElementType.BUG, ElementType.GRASS, 47, 24);
	public static final MonsterType Parasect  = new MonsterType(47, "Parasect",  ElementType.BUG, ElementType.GRASS, -1, 100);
	public static final MonsterType Venonat   = new MonsterType(48, "Venonat",   ElementType.BUG, ElementType.POISON, 49, 31);
	public static final MonsterType Venomoth  = new MonsterType(49, "Venomoth",  ElementType.BUG, ElementType.POISON, -1, 100);
	public static final MonsterType Diglett   = new MonsterType(50, "Diglett",   ElementType.GROUND, null, 51, 26);
	public static final MonsterType Dugtrio  = new MonsterType(51, "Dugtrio",  ElementType.GROUND, null, -1, 100);
	public static final MonsterType Meowth   = new MonsterType(52, "Meowth",   ElementType.NORMAL, null, 53, 31);
	public static final MonsterType Persian  = new MonsterType(53, "Persian",  ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Psyduck   = new MonsterType(54, "Psyduck",   ElementType.WATER, null, 55, 33);
	public static final MonsterType Golduck  = new MonsterType(55, "Golduck",  ElementType.WATER, null, -1, 100);
	public static final MonsterType Mankey   = new MonsterType(56, "Mankey",   ElementType.FIGHTING, null, 57, 28);
	public static final MonsterType Primeape  = new MonsterType(57, "Primeape",  ElementType.FIGHTING, null, -1, 100);
	public static final MonsterType Growlithe = new MonsterType(58, "Growlithe",   ElementType.FIGHTING, null, 59, 100);
	public static final MonsterType Arcanine  = new MonsterType(59, "Arcanine",  ElementType.FIGHTING, null, -1, 100);
	public static final MonsterType Poliwag = new MonsterType(60, "Poliwag", ElementType.WATER, null, 61, 25);
	public static final MonsterType Poliwhirl   = new MonsterType(61, "Poliwhirl",   ElementType.WATER, null, 62, 100);
	public static final MonsterType Poliwrath  = new MonsterType(62, "Poliwrath",  ElementType.WATER, ElementType.FIGHTING, -1, 100);
	public static final MonsterType Abra = new MonsterType(63, "Abra", ElementType.PSYCHIC, null, 64, 16);
	public static final MonsterType Kadabra   = new MonsterType(64, "Kadabra",   ElementType.PSYCHIC, null, 65, 100);
	public static final MonsterType Alakazam  = new MonsterType(65, "Alakazam",  ElementType.PSYCHIC, null, -1, 100);
	public static final MonsterType Machop = new MonsterType(66, "Machop", ElementType.FIGHTING, null, 67, 16);
	public static final MonsterType Machoke   = new MonsterType(67, "Machoke",   ElementType.FIGHTING, null, 68, 100);
	public static final MonsterType Machamp  = new MonsterType(68, "Machamp",  ElementType.FIGHTING, null, -1, 100);
	public static final MonsterType Bellsprout = new MonsterType(69, "Bellsprout", ElementType.GRASS, ElementType.POISON, 70, 21);
	public static final MonsterType Weepinbell   = new MonsterType(70, "Weepinbell",   ElementType.GRASS, ElementType.POISON, 71, 100);
	public static final MonsterType Victreebel  = new MonsterType(71, "Victreebel",  ElementType.GRASS, ElementType.POISON, -1, 100);
	public static final MonsterType Tentacool = new MonsterType(72, "Tentacool", ElementType.WATER, null, 73, 30);
	public static final MonsterType Tentacruel   = new MonsterType(73, "Tentacruel",   ElementType.WATER, null, -1, 100);
	
	public enum EvolutionType {
		LEVEL_UP,
		FRIENDSHIP,
		ITEM,
		TRADE,
		TRADE_WITH_ITEM,
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
		
		Nidorina.evolutionTrigger = EvolutionType.ITEM;
		Nidorina.evolutionItem = Item.ItemType.Moonstone;
		
		Clefairy.evolutionTrigger = EvolutionType.ITEM;
		Clefairy.evolutionItem = Item.ItemType.Moonstone;
		
		Vulpix.evolutionTrigger = EvolutionType.ITEM;
		Vulpix.evolutionItem = Item.ItemType.Firestone;
		
		Jigglypuff.evolutionTrigger = EvolutionType.ITEM;
		Jigglypuff.evolutionItem = Item.ItemType.Moonstone;
		
		Gloom.evolutionTrigger = EvolutionType.ITEM;
		Gloom.evolutionItem = Item.ItemType.Leafstone;
		
		Growlithe.evolutionTrigger = EvolutionType.ITEM;
		Growlithe.evolutionItem = Item.ItemType.Firestone;
		
		Poliwhirl.evolutionTrigger = EvolutionType.ITEM;
		Poliwhirl.evolutionItem = Item.ItemType.Waterstone;
		
		Kadabra.evolutionTrigger = EvolutionType.TRADE;

		Machoke.evolutionTrigger = EvolutionType.TRADE;
		
		Weepinbell.evolutionTrigger = EvolutionType.ITEM;
		Weepinbell.evolutionItem = Item.ItemType.Leafstone;
	}
}
