package Attacks;

import Monsters.ElementType;
import Monsters.Monster;

public class StatEffect extends Attack {

	public static final Attack AcidArmor = new StatEffect("Acid Armor",ElementType.POISON,false,false,false,true,false,false,false,true,10);
	public static final Attack DefenseCurl = new StatEffect("Defense Curl", ElementType.NORMAL,false,false,false,true,false,false,false,true,5);
	public static final Attack Growl = new StatEffect("Growl", ElementType.NORMAL, false,true,false,false,false,false,false,false,5);
	public static final Attack Growth = new StatEffect("Growth", ElementType.NORMAL, false,false,true,false,false,false,false,true,5);
	
	private boolean affectsHp;
	private boolean affectsDefense;
	private boolean affectsSpecialDefense;
	private boolean affectsAttack;
	private boolean affectsSpecialAttack;
	private boolean affectsSpeed;
	private boolean affectsEvasive;
	private boolean affectsSelf;
	private int pctChange;
	
	private StatEffect(String name, ElementType typ,boolean doHp, boolean doAtk, boolean doSpAtk, boolean doDef, boolean doSpDef, boolean doSpd, 
			                boolean doEvasive, boolean doSelf, int pct)
	{
		super(name, 100, 0, typ, 40, true);   //stats not relevant, just name and type
		affectsHp = doHp;
		affectsDefense = doDef;
		affectsSpecialDefense = doSpDef;
		affectsAttack = doAtk;
		affectsSpecialAttack = doSpAtk;
		affectsSpeed = doSpd;
		affectsEvasive = doEvasive;
		affectsSelf = doSelf;
		pctChange = pct;
	}
	
	@Override
	public void perform(Monster initiatorMonster, Monster targetMonster)
	{
		Monster recipient = targetMonster;
		if (affectsSelf) recipient = initiatorMonster;
		
		if (affectsHp)
		{
			int fullHp = recipient.getNormalHealth();
			float change = fullHp * (pctChange/100);
			int delta = (int) (change + .5);
			recipient.addHealth(delta);
		}
		if (affectsAttack)
		{
			int fullAtk = recipient.getNormalAttack();
			float change = fullAtk * (pctChange/100);
			int delta = (int) (change + .5);
			recipient.setAttack(delta + recipient.getAttack());
		}
		if (affectsSpecialAttack)
		{
			int fullAtk = recipient.getNormalSpecialAttack();
			float change = fullAtk * (pctChange/100);
			int delta = (int) (change + .5);
			recipient.setSpecialAttack(delta + recipient.getSpecialAttack());
		}
		if (affectsDefense)
		{
			int fullAtk = recipient.getNormalDefense();
			float change = fullAtk * (pctChange/100);
			int delta = (int) (change + .5);
			recipient.setDefense(delta + recipient.getDefense());
		}
		if (affectsSpecialDefense)
		{
			int fullAtk = recipient.getNormalSpecialDefense();
			float change = fullAtk * (pctChange/100);
			int delta = (int) (change + .5);
			recipient.setSpecialDefense(delta + recipient.getSpecialDefense());
		}
		if (affectsSpeed)
		{
			int fullAtk = recipient.getNormalSpeed();
			float change = fullAtk * (pctChange/100);
			int delta = (int) (change + .5);
			recipient.setSpeed(delta + recipient.getSpeed());
		}
		if (affectsEvasive)
		{
			int fullAtk = recipient.getNormalEvasive();
			float change = fullAtk * (pctChange/100);
			int delta = (int) (change + .5);
			recipient.setEvasive(delta + recipient.getEvasive());
		}
	}
}
