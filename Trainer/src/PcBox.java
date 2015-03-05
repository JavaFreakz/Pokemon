import java.util.List;


public class PcBox {

	private List<Monster> boxMonster;
	private static int POKEMON_PER_BOX = 20;
	
	public PcBox()
	{
		for (int i=0; i<POKEMON_PER_BOX; i++)
		{
			boxMonster.add(null);
		}
	}
}
