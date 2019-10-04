package com.iteso.nintendo;

public class Psychic implements InterfaceMainAttack{


	private int attackDamage;

	public String attack(){
		return "Psychic";
	}


	public int attackDamage() {
		return 23;
		
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage=attackDamage;
		
	}
}