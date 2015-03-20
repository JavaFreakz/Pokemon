package Monsters;

import java.util.ArrayList;
import java.util.List;

import Attacks.Attack;
import Attacks.AttackLevel;

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
//	public static final MonsterType Pikachu   = new MonsterType(25, "Pikachu", ElementType.ELECTRIC,   null, 26, 100);
	public static final MonsterType Raichu  = new MonsterType(26, "Raichu", ElementType.ELECTRIC,  null, -1, 100);
	public static final MonsterType Sandshrew   = new MonsterType(27, "Sandshrew", ElementType.GROUND,   null, 28, 22);
	public static final MonsterType Sandslash  = new MonsterType(28, "Sandslash", ElementType.GROUND,  null, -1, 100);
	public static final MonsterType NidoranF = new MonsterType(29, "NidoranF", ElementType.POISON, null, 30, 16);
//	public static final MonsterType Nidorina   = new MonsterType(30, "Nidorina",   ElementType.POISON, null, 31, 100);
	public static final MonsterType Nidoqueen  = new MonsterType(31, "Nidoqueen",  ElementType.POISON, ElementType.GROUND, -1, 100);
	public static final MonsterType NidoranM = new MonsterType(32, "NidoranM", ElementType.POISON, null, 30, 16);
//	public static final MonsterType Nidorino   = new MonsterType(33, "Nidorino",   ElementType.POISON, null, 31, 100);
	public static final MonsterType Nidoking  = new MonsterType(34, "Nidoking",  ElementType.POISON, ElementType.GROUND, -1, 100);
//	public static final MonsterType Clefairy   = new MonsterType(35, "Clefairy",   ElementType.NORMAL, null, 36, 100);
	public static final MonsterType Clefable  = new MonsterType(36, "Clefable",  ElementType.NORMAL, null, -1, 100);
//	public static final MonsterType Vulpix   = new MonsterType(37, "Vulpix",   ElementType.FIRE, null, 38, 100);
	public static final MonsterType Ninetales  = new MonsterType(38, "Ninetales",  ElementType.FIRE, null, -1, 100);
//	public static final MonsterType Jigglypuff   = new MonsterType(39, "Jigglypuff",   ElementType.NORMAL, null, 40, 100);
	public static final MonsterType Wigglytuff  = new MonsterType(40, "Wigglytuff",  ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Zubat   = new MonsterType(41, "Zubat",   ElementType.POISON, ElementType.FLYING, 42, 22);
	public static final MonsterType Golbat  = new MonsterType(42, "Golbat",  ElementType.POISON, ElementType.FLYING, -1, 100);
	public static final MonsterType Oddish = new MonsterType(43, "Oddish", ElementType.GRASS, ElementType.POISON, 44, 21);
//	public static final MonsterType Gloom   = new MonsterType(44, "Gloom",   ElementType.GRASS, ElementType.POISON, 45, 100);
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
//	public static final MonsterType Growlithe = new MonsterType(58, "Growlithe",   ElementType.FIGHTING, null, 59, 100);
	public static final MonsterType Arcanine  = new MonsterType(59, "Arcanine",  ElementType.FIGHTING, null, -1, 100);
	public static final MonsterType Poliwag = new MonsterType(60, "Poliwag", ElementType.WATER, null, 61, 25);
//	public static final MonsterType Poliwhirl   = new MonsterType(61, "Poliwhirl",   ElementType.WATER, null, 62, 100);
	public static final MonsterType Poliwrath  = new MonsterType(62, "Poliwrath",  ElementType.WATER, ElementType.FIGHTING, -1, 100);
	public static final MonsterType Abra = new MonsterType(63, "Abra", ElementType.PSYCHIC, null, 64, 16);
//	public static final MonsterType Kadabra   = new MonsterType(64, "Kadabra",   ElementType.PSYCHIC, null, 65, 100);
	public static final MonsterType Alakazam  = new MonsterType(65, "Alakazam",  ElementType.PSYCHIC, null, -1, 100);
	public static final MonsterType Machop = new MonsterType(66, "Machop", ElementType.FIGHTING, null, 67, 16);
//	public static final MonsterType Machoke   = new MonsterType(67, "Machoke",   ElementType.FIGHTING, null, 68, 100);
	public static final MonsterType Machamp  = new MonsterType(68, "Machamp",  ElementType.FIGHTING, null, -1, 100);
	public static final MonsterType Bellsprout = new MonsterType(69, "Bellsprout", ElementType.GRASS, ElementType.POISON, 70, 21);
//	public static final MonsterType Weepinbell   = new MonsterType(70, "Weepinbell",   ElementType.GRASS, ElementType.POISON, 71, 100);
	public static final MonsterType Victreebel  = new MonsterType(71, "Victreebel",  ElementType.GRASS, ElementType.POISON, -1, 100);
	public static final MonsterType Tentacool = new MonsterType(72, "Tentacool", ElementType.WATER, null, 73, 30);
	public static final MonsterType Tentacruel   = new MonsterType(73, "Tentacruel",   ElementType.WATER, null, -1, 100);
	public static final MonsterType Geodude = new MonsterType(74, "Geodude", ElementType.ROCK, ElementType.GROUND, 75, 25);
//	public static final MonsterType Graveler   = new MonsterType(75, "Graveler",   ElementType.ROCK, ElementType.GROUND,76, 100);
	public static final MonsterType Golem  = new MonsterType(76, "Golem",  ElementType.ROCK, ElementType.GROUND, -1, 100);
	public static final MonsterType Ponyta   = new MonsterType(77, "Ponyta",   ElementType.FIRE, null, 78, 40);
	public static final MonsterType Rapidash  = new MonsterType(78, "Rapidash",  ElementType.FIRE, null, -1, 100);
	public static final MonsterType Slowpoke = new MonsterType(79, "Slowpoke", ElementType.WATER, null, 80, 37);
	public static final MonsterType Slowbro   = new MonsterType(80, "Slowbro",   ElementType.WATER, null, -1, 100);
	public static final MonsterType Magnemite = new MonsterType(81, "Magnemite", ElementType.ELECTRIC, null, 82, 30);
	public static final MonsterType Magneton   = new MonsterType(82, "Magneton",   ElementType.ELECTRIC, null, -1, 100);
	public static final MonsterType Farfetchd   = new MonsterType(83, "Farfetch'd",   ElementType.NORMAL, ElementType.FLYING, -1, 100);
	public static final MonsterType Doduo   = new MonsterType(84, "Doduo",   ElementType.NORMAL, ElementType.FLYING, 85, 31);
	public static final MonsterType Dodrio   = new MonsterType(85, "Dodrio",   ElementType.NORMAL, ElementType.FLYING, -1, 100);
	public static final MonsterType Seel   = new MonsterType(86, "Seel",   ElementType.WATER, null, 87, 34);
	public static final MonsterType Dewgong   = new MonsterType(87, "Dewgong",   ElementType.WATER, ElementType.ICE, -1, 100);
	public static final MonsterType Grimer   = new MonsterType(88, "Grimer",   ElementType.POISON, null, 89, 38);
	public static final MonsterType Muk   = new MonsterType(89, "Muk",   ElementType.POISON, null, -1, 100);
//	public static final MonsterType Shellder   = new MonsterType(90, "Shellder",   ElementType.WATER, null, 91, 100);
	public static final MonsterType Cloyster   = new MonsterType(91, "Cloyster",   ElementType.WATER, ElementType.ICE, -1, 100);
	public static final MonsterType Ghastly = new MonsterType(92, "Ghastly", ElementType.GHOST, ElementType.POISON, 93, 25);
//	public static final MonsterType Haunter   = new MonsterType(93, "Haunter",   ElementType.GHOST, ElementType.POISON, 94, 100);
	public static final MonsterType Gengar  = new MonsterType(94, "Gengar",  ElementType.GHOST, ElementType.POISON, -1, 100);
	public static final MonsterType Onix   = new MonsterType(95, "Onix",   ElementType.ROCK, ElementType.GROUND, -1, 100);
	public static final MonsterType Drowzee   = new MonsterType(96, "Drowzee",   ElementType.PSYCHIC, null, 97, 26);
	public static final MonsterType Hypno   = new MonsterType(97, "Hypno",   ElementType.PSYCHIC, null, -1, 100);
	public static final MonsterType Krabby   = new MonsterType(98, "Krabby",   ElementType.WATER, null, 99, 28);
	public static final MonsterType Kingler   = new MonsterType(99, "Kingler",   ElementType.WATER, null, -1, 100);
	public static final MonsterType Voltorb   = new MonsterType(100, "Voltorb",   ElementType.ELECTRIC, null, 99, 30);
	public static final MonsterType Electrode   = new MonsterType(101, "Electrode",   ElementType.ELECTRIC, null, -1, 100);
//	public static final MonsterType Exeggcute   = new MonsterType(102, "Exeggcute",   ElementType.GRASS, ElementType.PSYCHIC, 103, 100);
	public static final MonsterType Exeggutor   = new MonsterType(103, "Exeggutor",   ElementType.GRASS, ElementType.PSYCHIC, -1, 100);
	public static final MonsterType Cubone   = new MonsterType(104, "Cubone",   ElementType.GROUND, null, 105, 28);
	public static final MonsterType Marowak   = new MonsterType(105, "Marowak",   ElementType.GROUND, null, -1, 100);
	public static final MonsterType Hitmonlee   = new MonsterType(106, "Hitmonlee",   ElementType.FIGHTING, null, -1, 100);
	public static final MonsterType Hitmonchan   = new MonsterType(107, "Hitmonchan",   ElementType.FIGHTING, null, -1, 100);
	public static final MonsterType Lickitung   = new MonsterType(108, "Lickitung",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Koffing   = new MonsterType(109, "Koffing",   ElementType.POISON, null, 110, 35);
	public static final MonsterType Weezing   = new MonsterType(110, "Weezing",   ElementType.POISON, null, -1, 100);
	public static final MonsterType Rhyhorn   = new MonsterType(111, "Rhyhorn",   ElementType.GROUND, ElementType.ROCK, 112, 42);
	public static final MonsterType Rhydon   = new MonsterType(112, "Rhydon",   ElementType.GROUND, ElementType.ROCK, -1, 100);
	public static final MonsterType Chansey   = new MonsterType(113, "Hitmonlee",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Tangela   = new MonsterType(114, "Hitmonchan",   ElementType.GRASS, null, -1, 100);
	public static final MonsterType Kangaskhan   = new MonsterType(115, "Lickitung",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Horsea   = new MonsterType(116, "Horsea",   ElementType.WATER, null, 117, 32);
	public static final MonsterType Seadra   = new MonsterType(117, "Seadra",   ElementType.WATER, null, -1, 100);
	public static final MonsterType Goldeen   = new MonsterType(118, "Goldeen",   ElementType.WATER, null, 119, 33);
	public static final MonsterType Seaking   = new MonsterType(119, "Seaking",   ElementType.WATER, null, -1, 100);
//	public static final MonsterType Staryu   = new MonsterType(120, "Staryu",   ElementType.WATER, null, 121, 100);
	public static final MonsterType Starmie   = new MonsterType(121, "Starmie",   ElementType.WATER, ElementType.PSYCHIC, -1, 100);
	public static final MonsterType MrMime   = new MonsterType(122, "Mr. Mime",   ElementType.PSYCHIC, null, -1, 100);
	public static final MonsterType Scyther   = new MonsterType(123, "Scyther",   ElementType.BUG, ElementType.FLYING, -1, 100);
	public static final MonsterType Jynx   = new MonsterType(124, "Jynx",   ElementType.ICE, ElementType.PSYCHIC, -1, 100);
	public static final MonsterType Electabuzz   = new MonsterType(125, "Electabuzz",   ElementType.ELECTRIC, null, -1, 100);
	public static final MonsterType Magmar   = new MonsterType(126, "Magmar",   ElementType.FIRE, null, -1, 100);
	public static final MonsterType Pinsir   = new MonsterType(127, "Pinsir",   ElementType.BUG, null, -1, 100);
	public static final MonsterType Tauros   = new MonsterType(128, "Tauros",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Magikarp   = new MonsterType(129, "Magikarp",   ElementType.WATER, null, 130, 20);
	public static final MonsterType Gyrados   = new MonsterType(130, "Gyrados",   ElementType.WATER, ElementType.FLYING, -1, 100);
	public static final MonsterType Lapras   = new MonsterType(131, "Lapras",   ElementType.WATER, ElementType.ICE, -1, 100);
	public static final MonsterType Ditto   = new MonsterType(132, "Ditto",   ElementType.NORMAL, null, -1, 100);
//	public static final MonsterType Eevee   = new MonsterType(133, "Eevee",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Vaporeon   = new MonsterType(134, "Vaporeon",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Jolteon   = new MonsterType(135, "Jolteon",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Flareon   = new MonsterType(136, "Flareon",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Porygon   = new MonsterType(137, "Porygon",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Omanyte   = new MonsterType(138, "Omanyte",   ElementType.ROCK, ElementType.WATER, 139, 40);
	public static final MonsterType Omastar   = new MonsterType(139, "Omastar",   ElementType.ROCK, ElementType.WATER, -1, 100);
	public static final MonsterType Kabuto   = new MonsterType(140, "Kabuto",   ElementType.ROCK, ElementType.WATER, 141, 40);
	public static final MonsterType Kabutops   = new MonsterType(141, "Kabutops",   ElementType.ROCK, ElementType.WATER, -1, 100);
	public static final MonsterType Aerodactyl   = new MonsterType(142, "Aerodactyl",   ElementType.ROCK, ElementType.FLYING, -1, 100);
	public static final MonsterType Snorlax   = new MonsterType(143, "Snorlax",   ElementType.NORMAL, null, -1, 100);
	public static final MonsterType Articuno   = new MonsterType(144, "Articuno",   ElementType.ICE, ElementType.FLYING, -1, 100);
	public static final MonsterType Zapdos   = new MonsterType(145, "Zapdos",   ElementType.ELECTRIC, ElementType.FLYING, -1, 100);
	public static final MonsterType Moltres   = new MonsterType(146, "Moltres",   ElementType.FIRE, ElementType.FLYING, -1, 100);
	public static final MonsterType Dratini   = new MonsterType(147, "Dratini",   ElementType.DRAGON, null, 148, 30);
	public static final MonsterType Dragonair   = new MonsterType(148, "Dragonair",   ElementType.DRAGON, null, 149, 55);
	public static final MonsterType Dragonite   = new MonsterType(149, "Dragonite",   ElementType.DRAGON, ElementType.FLYING, -1, 100);
	public static final MonsterType Mewtwo   = new MonsterType(150, "Mewtwo",   ElementType.PSYCHIC, null, -1, 100);
	public static final MonsterType Mew   = new MonsterType(151, "Mew",   ElementType.PSYCHIC, null, -1, 100);
	
	public enum EvolutionType {
		LEVEL_UP,
		ITEM,
		TRADE,
		TRADE_WITH_ITEM,
		NONE
	}
	
	private String name;
	protected int evolvesInto;
	protected EvolutionType evolutionTrigger;
	private int levelUpAt;
	private ElementType type2;
	private ElementType type;
	private int number;
	private List<AttackLevel> attackList = new ArrayList<>();
	
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
		if (evolvesInto > 0)
		{
			evolutionTrigger = EvolutionType.LEVEL_UP;  // default; override if necessary
		} else 
		{
			evolutionTrigger = EvolutionType.NONE;
		}
	}
	
	protected void setAttacks(List<AttackLevel> att)
	{
		attackList = att;
		
	}
	
	public String getName()
	{
		return name;
	}

	public int getId() {
		return number;
	}
	
	public ElementType getElement1()
	{
		return type;
	}
	
	public ElementType getElement2()
	{
		return type2;
	}
	
	public static void initialize()
	{
		initBulbasaur();
		initIvysaur();
	}
	
	private static void initBulbasaur()
	{
		List<AttackLevel> att = new ArrayList<>();
		att.add(new AttackLevel(Attack.Tackle, 1));
		att.add(new AttackLevel(Attack.Growl, 1));
		att.add(new AttackLevel(Attack.LeechSeed, 13));
		att.add(new AttackLevel(Attack.VineWhip, 13));
		att.add(new AttackLevel(Attack.Poisonpowder, 20));
		att.add(new AttackLevel(Attack.RazorLeaf, 27));
		att.add(new AttackLevel(Attack.Growth, 34));
		att.add(new AttackLevel(Attack.SleepPowder, 41));
		att.add(new AttackLevel(Attack.Solarbeam, 48));
		
		Bulbasaur.setAttacks(att);
		
		//TODO set up possible TMs and HMs
	}
	
	private static void initIvysaur()
	{
		List<AttackLevel> att = new ArrayList<>();
		att.add(new AttackLevel(Attack.Tackle, 1));
		att.add(new AttackLevel(Attack.Growl, 1));
		att.add(new AttackLevel(Attack.LeechSeed, 1));
		att.add(new AttackLevel(Attack.VineWhip, 13));
		att.add(new AttackLevel(Attack.Poisonpowder, 22));
		att.add(new AttackLevel(Attack.RazorLeaf, 30));
		att.add(new AttackLevel(Attack.Growth, 38));
		att.add(new AttackLevel(Attack.SleepPowder, 46));
		att.add(new AttackLevel(Attack.Solarbeam, 54));
		
		Ivysaur.setAttacks(att);
		
		//TODO set up possible TMs and HMs
	}
}
