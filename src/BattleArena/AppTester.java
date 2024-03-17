package BattleArena;

import java.util.Scanner;

public class AppTester {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice  = 0;
		String name = "";
		
		FightCharecter player1 = null;
		FightCharecter player2 = null;
		
		/**
		 * This code segment prompts two players to choose between Gnome and Dragon characters and enter their names.
		 * Bases on their choices, character objects are created for each player.
		 */
		
		for(int i = 1; i <= 2; i++) {
			System.out.println("Spieler " + i +": Wähle deinen Spielcharakter");
			System.out.println("1. Dragon");
			System.out.println("2. Gnom");
			System.out.println();
			boolean fw = true;
			
			do {
				choice = scanner.nextInt();
				if(choice == 1|| choice == 2  ){
					fw =false;
				}} while(fw);
			
			System.out.println("Spieler " + i +": Gib deinen Spielnamen an:");
			
			
			do {
				 name = scanner.next();
				
				} while(name.equals(""));
			
				if(player1 != null) {
					choice += 10;
				}
				switch (choice) {
				case 1: 
					player1 = new Dragon(name);
					break;
					
				case 2:
					player1 = new Gnome(name);
					break;
					
				case 11: 
					player2 = new Dragon(name);
					break;
					
				case 12:
					player2 = new Gnome(name);
					break;
				}
		}
		
		FightArena arena = new FightArena(player1, player2);
		
		arena.fight(scanner);
		
		scanner.close();
		
		
		
	}

}
