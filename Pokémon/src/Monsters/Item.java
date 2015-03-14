package Monsters;

public class Item {
	private ItemType itemType;
	private String itemName;
	String inCombat;
	String outOfCombat;
	
	public enum ItemType {
		Waterstone,
		Thunderstone,
		Moonstone,
		Leafstone,
		Firestone,
		RunningShoes,
		Bicycle,
		SilphScope,
		Potion,
		FullHeal
	}
}
