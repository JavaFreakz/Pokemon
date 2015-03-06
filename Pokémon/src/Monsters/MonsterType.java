package Monsters;

public class MonsterType {
	
	
	private String name;
	private MonsterType evolvesInto;
	private ElementType type2;
	private ElementType type;
	private int number;
	private MonsterAttack[] attackList;
	
	public int getNumber()
	{
		return number;
	}
	
	private MonsterType() {}
	
	protected MonsterType(int id, String nam, ElementType elem1, ElementType elem2, MonsterType becomes)
	{
		number = id;
		name = nam;
		type = elem1;
		type2 = elem2;
		evolvesInto = becomes;
		
	}
	
	public void setAttack(int attackId, MonsterAttack att)
	{
		if (attackId < 4)
		{
			attackList[attackId] = att;
		}
	}
}
