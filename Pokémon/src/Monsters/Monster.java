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
	int fullAttack;
	int specialAttack;
	int fullSpecialAttack;
	int defense;
	int fullDefense;
	int specialDefense;
	int fullSpecialDefense;
	int evasiveness;
	int fullEvasiveness;
	int speed;
	int fullSpeed;
	Attack[] moves;
	
	public static final String WILD_POKEMON = "wild";

	public MonsterType getType()
	{
		return type;
	}
	
	public String getTrainer() 
	{
		return originalTrainer;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int spd)
	{
		speed = spd;
	}
	public int getNormalSpeed() 
	{
		return fullSpeed;
	}
	public int getMaxHp()
	{
		return fullHealth;
	}
	public int getHealth()
	{
		return health;
	}
	public void addHealth(int points)
	{
		if (health + points > fullHealth)
		{
			health = fullHealth;
		}
		else
		{
			health = health + points;
		}
	}
	
	public int getEvasive()
	{
		return evasiveness;
	}
	public void setEvasive(int val)
	{
		evasiveness = val;
	}
	public int getNormalEvasive() 
	{
		return fullEvasiveness;
	}
	
	public int getAttack()
	{
		return attack;
	}
	public void setAttack(int val)
	{
		attack = val;
	}
	public int getNormalAttack() 
	{
		return fullAttack;
	}
	
	public int getDefense()
	{
		return defense;
	}
	public void setDefense(int val)
	{
		defense = val;
	}
	public int getNormalDefense() 
	{
		return fullDefense;
	}
	
	public int getSpecialAttack()
	{
		return specialAttack;
	}
	public void setSpecialAttack(int val)
	{
		specialAttack = val;
	}
	public int getNormalSpecialAttack() 
	{
		return fullSpecialAttack;
	}
	
	public int getSpecialDefense()
	{
		return specialDefense;
	}
	public void setSpecialDefense(int val)
	{
		specialDefense = val;
	}
	public int getNormalSpecialDefense() 
	{
		return fullSpecialDefense;
	}
	
	public List<AfflictionTypes> getAfflictions()
	{
		return afflictions;
	}
	
	public MonsterType getMonsterType()
	{ 
		return type;
	}
	
	public Attack[] getMoves()
	{
		return moves;
	}
}
