package BattleArena;

import java.util.Scanner;

public class AppTester {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice  = 0;
		String name = "";
		
		FightCharecter p1 = null;
		FightCharecter p2 = null;
		
		for(int i = 1; i<4; i++) {
			System.out.println("Spieler: Wähle deinen Spielcharakter" +i);
			System.out.println("1. Dragon");
			System.out.println("2. Gnome");
		}
			
		
		System.out.println("Spieler: Gib deinen Spielnamen an!");
		
		do {
			name = scanner.next();
		} while(name.equals(" "));
		if(p1 !=null) {
			
		}
	FightArena Arena = new FightArena ();
	
	
		

}}
