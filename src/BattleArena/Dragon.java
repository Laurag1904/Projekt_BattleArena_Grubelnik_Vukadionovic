package BattleArena;

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
	public int attack() {
		int attackNumber = randomNumb(20, 25+1);
		if (this.isSpecialAbilityActive()== true) {
			attackNumber -= randomNumb(5, 10+1);
		}
		return attackNumber;
	}


	/**
	 * If specialAbility is active +10 points
	 */
	public boolean activeAbility() {
		this.setExtraLife(getExtraLife()+10);
		this.setSpecialAbilityActive(true);
		return true;
	
	}


	
	/**
	 * If specialAbility is deactivated subtract Bonus and Malus if points are greater than 0 else set Points as 0
	 */
	public boolean deactiveAbility() {
		this.setSpecialAbilityActive(false);
		this.setExtraLife(0);
		return true;	
	}
}

