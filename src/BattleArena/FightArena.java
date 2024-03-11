package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class FightArena { 
	
	private FightCharecter Player1;
	private FightCharecter Player2;
	private FightCharecter winner;
	
	public FightArena(FightCharecter player1, FightCharecter player2, FightCharecter winner) {
		super();
		Player1 = player1;
		Player2 = player2;
		this.winner = winner;
	}

	/**
	 * 
	 * @return number between 1 and 2 to select random figther 1=figther1, 2=figther2
	 */
	public int randomFighter(){
		return ThreadLocalRandom.current().nextInt(1,2+1);
	}


/*
 * shows Stats (points,...)
 */
	public void printStats() {
		System.out.println();
	}
}
//TODO 
//Method fight
//print method
//class that sets winner