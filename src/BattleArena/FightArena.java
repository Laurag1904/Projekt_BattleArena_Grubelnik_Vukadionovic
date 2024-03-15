package BattleArena;

import java.util.Scanner;
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


/*
 * shows Stats (points,...)
 */
	public void printStats() {
		System.out.println();
	}

//TODO 
	public void fight(Scanner scanner) {
		
		FightCharecter attacker;
		FightCharecter victim;
		
		do {
			if() {
				attacker = f1;
				victim = f2;
			}
		}
	}

	public void simulateCombat(FightCharecter attacker, FightCharecter victim, Scanner scanner) {
		System.out.println(attacker.getName()+ "ist an der Reihe");
		System.out.println("Bitte geben Sie ihren Zug an(1= Angreifen, 2= faehigkeit verdoppeln");
		int Input = ConsoleInput(scanner);
		switch(Input) {
		case 1: // angreifen
			int value = attacker.attack();
			victim.getDamage(value);
			break;
			
		case 2: // aktivieren 
			if(attacker.isSpecialAbilityActive()) {
				attacker.specialAbilityDeactivated();
			} else {
				if(!attacker.specialAbilityActive()) {
					simulateCombat(attacker, victim, scanner);
				}
			}break;
		
		default: 
			System.err.println("Bitte geben Sie einen gultigen Wert ein!");
			simulateCombat(attacker, victim, scanner);
			break;
		}
		
	}
	private int ConsoleInput(Scanner scanner) {
		int b = scanner.nextInt();
		return b;
	}

}
//print method
//class that sets winner