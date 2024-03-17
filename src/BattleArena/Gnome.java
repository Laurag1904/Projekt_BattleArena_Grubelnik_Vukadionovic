package BattleArena;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Gnome extends FightCharecter {
	
	public Gnome(String name) {
		super(name);
		
	}
	public String getName() {
		return "Gnome";
	}
	
	
	public void getDamage(int points) {
	}
	
	public void attack () {
		int attackNumber = ThreadLocalRandom.current().nextInt(20,25);
		if(this.isSpecialAbilityActive()) {
			double random = Math.random();
			
		}
	} 
	
	/**
	 * Tis ability activates only if, the Gnome current lifepoints are less then 50 or equal.
	 * @return true if it is activated, false if it is not
	 */
	
	public boolean activateSpecialSkills() {
		if(this.getLifepoints()<= 50) {
			this.setSpecialAbilityActive(true);
			return true;
		}else {
			this.setSpecialAbilityActive(false);
			return false;
		}
	}
	
	
	 
	
}
