package BattleArena;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Gnome {
	
	private String Name;
	private int Lifepoints;
	private boolean SpecialAbilityActive;
	
	
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
                this.Lifepoints = 0; // Lebenspunkte können nicht negativ sein
            }
            System.out.println(this.Name + " hat " + points + " Schaden erlitten!");
        }
	}
	
	public void attack () {
		ThreadLocalRandom.current().nextInt(min, max + 1);
		Random rand = new Random ();
		
	}
	
}
