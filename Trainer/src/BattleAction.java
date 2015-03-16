
public class BattleAction {

	public enum Type {
		UseMove,
		SwitchOut,
		UseItem
	}
	
	public int moveIdx;
	public int benchPos;
	public String itemName;
}
