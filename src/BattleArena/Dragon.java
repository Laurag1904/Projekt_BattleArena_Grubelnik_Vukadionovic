package BattleArena;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dragon { 
	
	private String name;
	private int lifePoints;
	private boolean specialAbilityActive;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	public boolean isSpecialAbilityActive() {
		return specialAbilityActive;
	}
	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		this.specialAbilityActive = specialAbilityActive;
	}
	
	
	public void getDamage(int points) {
		
	}
	
	public void attack(Character enemy) {
		ThreadLocalRandom.current().nextInt(min, max + 1);
        Random rand = new Random ();

	}}