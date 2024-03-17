package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public abstract class FightCharecter {

	//attributes
	private String name;
	private int lifepoints;
	private boolean specialAbilityActive;
	private int extraLife;
	
	//Constructor
	public FightCharecter(String name) {
		super();
		this.name = name;
		this.lifepoints = 100;
		this.specialAbilityActive = false;
		this.extraLife = 0;
	}

	
	// Getter and Setter
	public int getExtraLife() {
		return extraLife;
	}



	public void setExtraLife(int extraLife) {
		this.extraLife = extraLife;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLifepoints() {
		return lifepoints;
	}


	public boolean isSpecialAbilityActive() {
		return specialAbilityActive;
	}


	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		this.specialAbilityActive = specialAbilityActive;
	}
	
	/**
	 * generates a random number 
	 * @param min and max 
	 * @return random generated number
	 */
	public int randomNumb(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}
	
	/**
	 * Reduces the character's lifepoints by a specified amount of damage.
	 * If character has ectra life points, it subtracts damage from those first, then from the main lifepoints.
	 * If damage exceeds total lifepoints set to 0.
	 * @param points represents the amount of damage on a character.
	 */
	public void getDamage(int points) { 
		if(this.extraLife > 0) {
			if (this.extraLife - points >= 0) {
				this.extraLife = this.extraLife - points;
				points = 0;
			}else {
				points = points - this.extraLife;
				this.extraLife = 0;
			}	
		}
		if (lifepoints - points >= 0) {
			this.lifepoints = lifepoints - points;
			points = 0;
		}else {
			lifepoints = 0; 
		}
	}
		
	// returns the character status.
	public String toString() {
		return this.name + " hat " + (this.lifepoints + this.extraLife) + 
				" leben + extraleben und der spezialeffekt ist: " + this.specialAbilityActive;
	}
	
	
	public abstract int attack();
	
	public abstract boolean activeAbility ();
	
	public abstract boolean deactiveAbility();
	
}
