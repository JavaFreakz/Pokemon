package bag;

import Monsters.Item;
import Monsters.Monster;

public class Potion extends Item {

	public Potion()
	{
		super(Item.ItemType.Potion, "Potion", true, true, true);
	}

	@Override
	public void use(Monster recipient) {
		// Increase the recipient's HP by up to 20 or max, whichever is less
		recipient.addHealth(20);
	}
}
