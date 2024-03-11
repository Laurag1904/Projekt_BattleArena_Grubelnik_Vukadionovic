package BattleArena;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends FightCharecter{


	public Dragon(String name) {
		super(name);	
			
	}
	
	/**
	 * Attacknumber between 20 and 25 whick is randomly added at every attack, is being subracted from the opponed when attacked
	 */
	/*
	 * Malus at basevalue if specialAbility is active, random number between 5 and 10
	 */
	public void attack() {
		int attackNumber = ThreadLocalRandom.current().nextInt(20,25);
		if (this.isSpecialAbilityActive()== true) {
			attackNumber = attackNumber- ThreadLocalRandom.current().nextInt(5,10);
		}
	}


	/**
	 * If specialAbility is active +10 points
	 */
	public boolean specialAbilityActive() {
		this.setExtraLife(getExtraLife()+10);
		this.setSpecialAbilityActive(true);
		return true;
	
	}


	
	/**
	 * If specialAbility is deactivated subtract Bonus and Malus if points are greater than 0 else set Points as 0
	 */
	public boolean specialAbilityDeactivated() {
		this.setSpecialAbilityActive(false);
		if (this.getExtraLife() - 10 >= 0) {
			this.setExtraLife(getExtraLife()-10);
		}else {
			this.setExtraLife(0);
		}
		return true;	
	}
}

