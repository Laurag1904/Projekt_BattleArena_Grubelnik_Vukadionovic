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
