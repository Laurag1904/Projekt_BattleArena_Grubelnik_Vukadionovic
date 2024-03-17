package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public abstract class FightCharecter {

	private String name;
	private int lifepoints;
	private boolean specialAbilityActive;
	private int extraLife;
	
	
	public FightCharecter(String name) {
		super();
		this.name = name;
		this.lifepoints = 100;
		this.specialAbilityActive = false;
		this.extraLife = 0;
	}

	

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
	
	//Method which subtracts Point if gotten any Damage
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
		
	public String toString() {
		return this.name + " hat " + (this.lifepoints + this.extraLife) + 
				" leben + extraleben und der spezialeffekt ist: " + this.specialAbilityActive;
	}
	
	
	public abstract int attack();
	
	public abstract boolean activeAbility ();
	
	public abstract boolean deactiveAbility();
	
}
