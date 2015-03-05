import java.util.ArrayList;
import java.util.List;


public class Pokedex {

	private static final int MAX_KIND_OF_POKEMON = 151;
	
	private List<PokedexEntry> entries;
	
	public Pokedex()
	{
		entries = new ArrayList<PokedexEntry>();
		for(int i=0; i<MAX_KIND_OF_POKEMON; i++)
		{
			entries.add(new PokedexEntry());
		}
	}
	
	public void addSeen(Monster candidate)
	{
		int pokedexId = candidate.getType().getNumber();
		
		PokedexEntry entry = entries.get(pokedexId);
		entry.setSeen();
		
	}
	
	public void addOwned(Monster candidate)
	{
		int pokedexId = candidate.getType().getNumber();
		
		PokedexEntry entry = entries.get(pokedexId);
		entry.setOwned();
		
	}
	
	public PokedexEntry getEntry(final int id)
	{
		if (id < MAX_KIND_OF_POKEMON)
		{
			return entries.get(id);
		}
		return null;
	}
}
