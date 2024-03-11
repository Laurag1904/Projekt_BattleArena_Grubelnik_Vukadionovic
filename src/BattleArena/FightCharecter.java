package BattleArena;

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


	private void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}


	public boolean isSpecialAbilityActive() {
		return specialAbilityActive;
	}


	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		this.specialAbilityActive = specialAbilityActive;
	}
	
	public  void getDamage(int points) {
		
		if (extraLife - points >= 0) {
			this.extraLife = this.extraLife - points;
			points = 0;
		}else {
			points = points - this.extraLife;
			this.extraLife = 0;
			
		}	
		if (lifepoints - points >= 0) {
			this.lifepoints = lifepoints - points;
			points = 0;
		}else {
		lifepoints = 0; 
	
	
			
		}
			
		}
		
		//TODO  toString
		
		
	
	
	public abstract void attack();
	
	
	public String toString() {
		return "FightCharecter [name=" + name + ", lifepoints=" + lifepoints + ", specialAbilityActive="
				+ specialAbilityActive + ", extraLife=" + extraLife + "]";
	}



	public abstract boolean specialAbilityActive ();
	
	public abstract boolean specialAbilityDeactivated();
	
	
	
	
	
		
		
	
	
	
	
	
}
