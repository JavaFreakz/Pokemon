package battles;

import Monsters.Item;
import Monsters.Monster;

public class BattleAction {

	public enum Type {
		UseMove,
		SwitchOut,
		UseItem,
		Run
	}
	
	public Type toDo;
	public int moveIdx;
	public int benchPos;
	public Item item;
	public Monster monster;
}
