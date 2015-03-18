package trainer;

public class PokedexEntry {

	private boolean seen;
	private boolean owned;
	
	public PokedexEntry() 
	{
		seen = false;
		owned = false;
	}
	
	public void setSeen()
	{
		seen = false;
	}
	
	public void setOwned()
	{
		owned = true;
	}
	
	public boolean isOwned()
	{ 
		return owned;
	}
	
	public boolean wasSeen()
	{
		return seen;
	}
}
