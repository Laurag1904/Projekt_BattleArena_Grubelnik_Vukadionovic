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

	
	public FightCharecter getPlayer1() {
		return Player1;
	}


	public void setPlayer1(FightCharecter player1) {
		Player1 = player1;
	}


	public FightCharecter getPlayer2() {
		return Player2;
	}


	public void setPlayer2(FightCharecter player2) {
		Player2 = player2;
	}


	public FightCharecter getWinner() {
		return winner;
	}


	public void setWinner(FightCharecter winner) {
		this.winner = winner;
	}


	/**
	 * 
	 * @return number between 1 and 2 to select random figther 1=figther1, 2=figther2
	 */
	public int randomFighter(){
		return ThreadLocalRandom.current().nextInt(1,2+1);
	}


	public void simulateCombat() {
		
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