package BattleArena;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FightArena { 
	
	private FightCharecter Player1;
	private FightCharecter Player2;
	private FightCharecter winner;
	
	public FightArena(FightCharecter player1, FightCharecter player2) {
		super();
		Player1 = player1;
		Player2 = player2;
		this.winner = null;
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


	public void fight(Scanner scanner) {
		
		FightCharecter attacker;
		FightCharecter victim;
		int randomPlayer = ThreadLocalRandom.current().nextInt(1,2+1);
		
		do {
			if(randomPlayer == 1) {
				attacker = Player1;
				victim = Player2;
				randomPlayer = 2;
			}else if(randomPlayer == 2){
				attacker = Player2;
				victim = Player1;
				randomPlayer = 1;
			}else {
				attacker = Player2;
				victim = Player1;
				System.err.println("FEHLER");
			}
			System.out.println(attacker);
			System.out.println(victim);
			simulateCombat(attacker, victim, scanner);
			this.setWinner(winnerExist());
			
		}while(this.winnerExist() == null);
		System.out.println("--- E N D E ---");
		System.out.println(this.getWinner().getName() + " hat gewonnen!");
	}
	
	
	private FightCharecter winnerExist() {
		if (Player1.getLifepoints() <= 0) {
			return Player2;
		} else if (Player2.getLifepoints() <= 0) {
			return Player1;
		} else
			return null;
	}

	public void simulateCombat(FightCharecter attacker, FightCharecter victim, Scanner scanner) {
		System.out.println();
		System.out.println(attacker.getName()+ " ist an der Reihe");
		System.out.println("Bitte geben Sie ihren Zug an(1= Angreifen, 2= faehigkeit)");
		int Input = ConsoleInput(scanner);
		switch(Input) {
		case 1: // angreifen
			int value = attacker.attack();
			victim.getDamage(value);
			break;
			
		case 2: // aktivieren 
			if(attacker.isSpecialAbilityActive()) {
				attacker.deactiveAbility();
			} else {
				if(!attacker.activeAbility()) {
					simulateCombat(attacker, victim, scanner);
				}
			}
			break;
		
		default: 
			System.err.println("Bitte geben Sie einen gueltigen Wert ein!");
			simulateCombat(attacker, victim, scanner);
			break;
		}
		
	}
	private int ConsoleInput(Scanner scanner) {
		int b = scanner.nextInt();
		return b;
	}
	
	public void print() {
		System.out.println();
	}
}