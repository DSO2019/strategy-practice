package com.iteso.nintendo;

public class ThunderShock implements InterfaceMainAttack{


	private int attackDamage;

	public String attack(){
		return "ThunderShock";
	}


	public int attackDamage() {
		return 18;
		
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage=attackDamage;
		
	}
}