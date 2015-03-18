package trainer;
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
		SwimmerMale,
		SwimmerFemale,
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
	
	// Automation of trainer moves:
	//
	// boolean newMonster = false;
	// if (t2monster HP == 0)
//	{
//		get next t2mon
//		newMonster = true;
//	}
//	if (t1 super vs t2)
//	{
//		if have non-super
//		{
//			get new t2 monster
//    	    newMonster = true;
//		}
//	}
//	if newMonster 
//	   return switchTo action;
//	if t2 has status && have a healer
//	   return use item action
//	if super attack available, use strongest
//	if type attack available, use strongest
//	use strongest.   
//	(for wild battles, randomize attack)
}
