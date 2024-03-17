package BattleArena;

public class Gnome extends FightCharecter {
	
	public Gnome(String name) {
		super(name);
		
	}

	/**
	 * This ability activates only if, the Gnome current lifepoints are less then 50 or equal.
	 * @return true if it is activated, false if it is not
	 */
	public boolean activeAbility() {
		if(this.getLifepoints()<= 50) {
			this.setSpecialAbilityActive(true);
			return true;
		}else {
			System.err.println("Spezialeffekt kann erst unter 50 Leben aktiviert werden!");
			return false;
		}
	}
	
	/**
	 * Defines a method which calculates the damage by the character during an attack.
	 * The damage is determined by a random number between 15 and 25.
	 * If the character's special ability is active there are checks based on the character's remaining
	 * lifepoints to double the damage.
	 * At last the calculated damage value is returned.
	 */
	public int attack() {
		int damage = randomNumb(15, 25+1);
		if(activeAbility()) {
			if(randomNumb(1,10)>3){
				damage *= 2;
			}else if(this.getLifepoints()>=20) {
				if(randomNumb(1,10)>5) {
					damage *=2;
				}	
			}else if(this.getLifepoints()>=10) {
				if(randomNumb(1,10)>7) {
					damage *=2;
				}
			}
		}
		return damage;
	}

	@Override
	public boolean deactiveAbility() {
		this.setSpecialAbilityActive(false);
		return true;
	}
	
}
