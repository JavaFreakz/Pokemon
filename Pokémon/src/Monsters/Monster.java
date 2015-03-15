package Monsters;
import java.util.List;

import Attacks.Attack;


public class Monster {
	
	public enum StatusCondition {
		NO_STATUS_CONDITION,
		FROZEN,
		PARALYZED,
		BURNED,
		POISONED,
		SLEEP
	}
	
	public enum AfflictionTypes {
		CONFUSED,
		CURSED
	}
	
	String name;
	MonsterType type;
	Item itemHeld;
	String gender;
	boolean shiny;
	String originalTrainer;
	String currentTrainer;
	StatusCondition status;
	List<AfflictionTypes> afflictions;
	int monsterlvl;
	int experience;               // Amount so far (all levels combined)
	int nextLevelExperience;      // Amount to achieve before leveling up
	int experienceGiven;          // Amount an ooposing pokemon gains if this one is deleted
	int health;                   // current HP
	int fullHealth;               // full HP
	int attack;
	int specialAttack;
	int defense;
	int specialdefense;
	int evasiveness;
	Attack atk1;
	Attack atk2;
	Attack atk3;
	Attack atk4;
	
	public static final String WILD_POKEMON = "wild";

	public MonsterType getType()
	{
		return type;
	}
	
	public String getTrainer() 
	{
		return originalTrainer;
	}
}
