import region.Location;


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
    
    // Outline of how to code a battle
    // 
    // BattleResult result = BattleResult.Result.NoDecision;
    // while(result == BattleResult.Result.NoDecision)
    // {
    //    get player move into playerAction
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
    	
    	
    	return ret;
    }
}
