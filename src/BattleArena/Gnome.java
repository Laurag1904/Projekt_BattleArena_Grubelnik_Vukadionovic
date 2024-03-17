package BattleArena;


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
	} 
	
	/**
	 * This ability activates only if, the Gnome current lifepoints are less then 50 or equal.
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
	
	public int attacked() {
		int damage = randomNumb(15, 25+2);
		if(activateSpecialSkills()) {
			if(activateSpecialSkills()) {
				if(randomNumb(1,10)>3){
					damage *= 2;
				}
			}else if(this.getLifepoints()>=20) {
				if(randomNumb(1,10)>5) {
					damage *=2;
				}
			}
		}
		return damage;
	}
	
	 
	
}
