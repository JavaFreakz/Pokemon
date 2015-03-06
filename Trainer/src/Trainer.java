import Monsters.Monster;


public class Trainer {

	private String name;
	private int trainerId;
	private Monster[] bench = {null,null,null,null,null,null};
	private int pokeDollars;
	private Location currentPos;
	private Direction facing;
	private Pokedex pokedex;
	private GymBadge[] badges = {null,null,null,null,null,null,null,null};
	private PokemonPc pc;
}
