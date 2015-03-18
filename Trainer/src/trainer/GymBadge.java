package trainer;

public class GymBadge {

	private String name;
	private int levelForPokemon;
	
	private GymBadge() {}
	
	private GymBadge(final String nam, final int lvl)
	{
		name = nam;
		levelForPokemon = lvl;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPokemonControl()
	{
		return levelForPokemon;
	}
}
