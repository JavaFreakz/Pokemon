
public class Monster {
	String name;
	MonsterType type;
	Item itemHeld;
	String gender;
	boolean shiny;
	String originalTrainer;
	int monsterlvl;
	int experience;
	int health;
	int attack;
	int SpecialAttack;
	int defense;
	int Specialdefense;
	int Evasiveness;
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
