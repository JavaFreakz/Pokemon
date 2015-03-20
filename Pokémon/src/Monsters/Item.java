package Monsters;

public abstract class Item {
	private ItemType itemType;
	private String itemName;
	boolean inCombat;
	boolean outOfCombat;
	boolean singleUse;
	
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
	
	private Item() 
	{
		
	}
	
	protected Item(ItemType typ, String nam, boolean useInBattle, boolean useOutOfBattle, boolean consumable)
	{
		setItemType(typ);
		setItemName(nam);
		setBattleItem(useInBattle);
		setNonBattleItem(useOutOfBattle);
		setSingleUse(consumable);
	}
	
	protected void setItemType(ItemType typ)
	{
		itemType = typ;
	}
	
	protected void setItemName(String nam)
	{
		itemName = nam;
	}
	
	protected void setBattleItem(boolean isBattleItem)
	{
		inCombat = isBattleItem;
	}
	
	protected void setNonBattleItem(boolean useAnytime)
	{
		outOfCombat = useAnytime;
	}
	
	protected void setSingleUse(boolean consumable)
	{
		singleUse = consumable;
	}
	
	public abstract void use(Monster recipient);
}
