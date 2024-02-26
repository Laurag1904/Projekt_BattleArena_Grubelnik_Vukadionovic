package BattleArena;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Gnome {
	
	private String Name;
	private int Lifepoints;
	private boolean SpecialAbilityActive;
	private String enemy;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLifepoints() {
		return Lifepoints;
	}
	public void setLifepoints(int lifepoints) {
		Lifepoints = lifepoints;
	}
	public boolean isSpecialAbilityActive() {
		return SpecialAbilityActive;
	}
	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		SpecialAbilityActive = specialAbilityActive;
	}
	
	
	public void getDamage(int points) {
		if (points > 0) {
            this.Lifepoints -= points;
            if (this.Lifepoints < 0) {
                this.Lifepoints = 0; // Lebenspunkte k�nnen nicht negativ sein
            }
            System.out.println(this.Name + " hat " + points + " Schaden erlitten!");
        }
	}
	
	public int attackrandom () {
		ThreadLocalRandom.current().nextInt(min, max + 1);
		Random rand = new Random ();
		
		
	} 
	 public void attack(String enemy) {
	        int attackrandom = this.attackrandom();
	        System.out.println(this.Name + " greift " + enemy.getName() + " an mit Angriffswert " + angriffswert);

	        // Schaden beim Gegner verursachen
	        enemy.getDamage();
	    }

	 
	
}
