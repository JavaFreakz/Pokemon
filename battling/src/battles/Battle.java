package battles;
import Monsters.Monster;
import region.Location;
import trainer.Trainer;


public class Battle {
	private Trainer trainer1;
	private Trainer trainer2;
	
    private Location battleLoc;
    
    public enum Result {
    	T1Win,
    	T2Win,
    	NoDecision,
    	T1MonsterFaint,
    	T2MonsterFaint,
    	BothFaint
    }
    
    public Battle(Trainer t1, Trainer t2, Location loc)
    {
    	trainer1 = t1;
    	trainer2 = t2;
    	battleLoc = loc;
    }
    
    public void initializeStatistics()
    {
	    // when the battle is started, evasiveness, confusion and some other
	    // conditions should be reset.
    	trainer1.setCurrentMonster(trainer1.getCurrBenchPos());
    	trainer2.setCurrentMonster(trainer2.getCurrBenchPos());
    }
    
    // Outline of how to code a battle
    // 
    // BattleResult result = BattleResult.Result.NoDecision;
    // while(result == BattleResult.Result.NoDecision)
    // {
    //    get player move into playerAction (switch, fight, item, run)
    //    get opponent move into opponentAction
    //    result = battle.round(playerAction, opponentAction);
    //    if (result == BattleResult.Result.T1MonsterFaint || 
    //        result == BattleResult.Result.BothFaint)
    //       get new monster from player;
    //    if (result == BattleResult.Result.T2MonsterFaint ||
    //        result == BattleResult.Result.BothFaint)
    //       get new monster from trainer 2;
    //    if (! (BattleResult.Result.T1Win || BattleResult.Result.T2Win))
    //       result = BattleResult.Result.NoDecision;
    // }
    
    public Result round(BattleAction t1Action, BattleAction t2Action)
    {
    	Result ret = Result.NoDecision;
    	
    	if (t1Action.toDo == BattleAction.Type.UseItem)
    		t1Action.item.use(t1Action.monster);
    	if (t2Action.toDo == BattleAction.Type.UseItem)
    		t2Action.item.use(t2Action.monster);
    	if (t1Action.toDo == BattleAction.Type.SwitchOut)
    		trainer1.setCurrentMonster(t1Action.benchPos);
    	if (t2Action.toDo == BattleAction.Type.SwitchOut)
    		trainer2.setCurrentMonster(t2Action.benchPos);
    	if ((t1Action.toDo == BattleAction.Type.UseItem || t1Action.toDo == BattleAction.Type.SwitchOut) &&
    		(t2Action.toDo == BattleAction.Type.UseItem || t2Action.toDo == BattleAction.Type.SwitchOut))
    		return Result.NoDecision;
    	Monster t1Monster = trainer1.getBench()[trainer1.getCurrBenchPos()];
    	Monster t2Monster = trainer2.getBench()[trainer2.getCurrBenchPos()];
    	if (t1Action.toDo == BattleAction.Type.UseMove && t1Monster.getSpeed() > t2Monster.getSpeed())
    	{
    		t1Monster.getMoves()[t1Action.moveIdx].perform(t1Monster, t2Monster);
 
    		int t1Hp = t1Monster.getHealth();
    		int t2Hp = t2Monster.getHealth();
    		if (t1Hp > 0 && t2Hp == 0) return Result.T2MonsterFaint;
    		if (t1Hp == 0 && t2Hp == 0) return Result.BothFaint;
    		if (t1Hp == 0 && t2Hp > 0) return Result.T1MonsterFaint;

    		t2Monster.getMoves()[t2Action.moveIdx].perform(t2Monster, t1Monster);
    		
    		t1Hp = t1Monster.getHealth();
    		t2Hp = t2Monster.getHealth();
    		if (t1Hp > 0 && t2Hp == 0) return Result.T2MonsterFaint;
    		if (t1Hp == 0 && t2Hp == 0) return Result.BothFaint;
    		if (t1Hp == 0 && t2Hp > 0) return Result.T1MonsterFaint;
    	} 
    	else
    	{
    		if (t2Action.toDo == BattleAction.Type.UseMove)
        	{
        		t2Monster.getMoves()[t2Action.moveIdx].perform(t2Monster, t1Monster);

        		int t1Hp = t1Monster.getHealth();
        		int t2Hp = t2Monster.getHealth();
        		if (t1Hp > 0 && t2Hp == 0) return Result.T2MonsterFaint;
        		if (t1Hp == 0 && t2Hp == 0) return Result.BothFaint;
        		if (t1Hp == 0 && t2Hp > 0) return Result.T1MonsterFaint;

        		t1Monster.getMoves()[t1Action.moveIdx].perform(t1Monster, t2Monster);
        		
        		t1Hp = t1Monster.getHealth();
        		t2Hp = t2Monster.getHealth();
        		if (t1Hp > 0 && t2Hp == 0) return Result.T2MonsterFaint;
        		if (t1Hp == 0 && t2Hp == 0) return Result.BothFaint;
        		if (t1Hp == 0 && t2Hp > 0) return Result.T1MonsterFaint;
        	}
    	}
    	return ret;
    }
}
