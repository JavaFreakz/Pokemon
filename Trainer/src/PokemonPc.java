import java.util.ArrayList;
import java.util.List;


public class PokemonPc {

	private List<PcBox> boxes;
	private static int MAX_BOX = 24;
	
	public PokemonPc() 
	{
		boxes = new ArrayList<PcBox>();
		for (int i=0; i < MAX_BOX; i++)
		{
			boxes.add(new PcBox());
		}
	}
}
