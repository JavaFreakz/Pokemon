import region.Direction;
import region.Location;
import Monsters.Monster;


public class Trainer {

	private String name;
	private Monster[] bench = {null,null,null,null,null,null};
	private int pokeDollars;
	private Location currentPos;
	private Direction facing;
	private TrainerType type;
	
	public enum TrainerType {
		Player,
		GymLeader,
		RocketGrunt,
		Scientist,
		Rival,
		Swimmer,
		Hiker,
		Picnicker,
		Gentleman,
		Biker
	}
	
	protected Trainer() {}
	
	public Trainer(TrainerType typ, String nam, int loot, Location pos, Direction dir, Monster[] party) throws Exception
	{
		// don't let just anyone create themain character
		if (type == TrainerType.Player) throw new Exception("invalid trainer type");
		
		initialize(typ, nam, loot, pos, dir, party);
	}

	protected void initialize(TrainerType typ, String nam, int loot, Location pos, Direction dir, Monster[] party)
	{
		type = typ;
		bench = party;
		pokeDollars = loot;
		currentPos = pos;
		facing = dir;
		bench = party;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Monster[] getBench() {
		return bench;
	}
	public void setBench(Monster[] bench) {
		this.bench = bench;
	}
	public int getPokeDollars() {
		return pokeDollars;
	}
	public void setPokeDollars(int pokeDollars) {
		this.pokeDollars = pokeDollars;
	}
	public Location getCurrentPos() {
		return currentPos;
	}
	public void setCurrentPos(Location currentPos) {
		this.currentPos = currentPos;
	}
	public Direction getFacing() {
		return facing;
	}
	public void setFacing(Direction facing) {
		this.facing = facing;
	}
	public TrainerType getType() {
		return type;
	}
	public void setType(TrainerType type) {
		this.type = type;
	}
}
