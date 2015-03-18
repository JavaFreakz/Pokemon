package trainer;
import region.KantoMap;
import region.LeagueMap;
import Monsters.Monster;


public class Player extends Trainer {
	private Pokedex pokedex;
	private GymBadge[] badges = {null,null,null,null,null,null,null,null};
	private PokemonPc pc;
	private int trainerId;

	public final static Player THE_PLAYER = new Player();
	
	private Player()
	{
		Monster[] bench = new Monster[6];
		
		try
		{
			LeagueMap leagueMap = new KantoMap();
			super.initialize(Trainer.TrainerType.Player, "Ash", 0, leagueMap.StartLocation, leagueMap.StartDirection, bench);
		} finally {
			trainerId = 1;
		}
	}
	
	
}
