package com.iteso.nintendo;

public class FireFang implements InterfaceMainAttack{


	private int attackDamage;

	public String attack(){
		return "FireFang";
	}


	public int attackDamage() {
		return 17;
		
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage=attackDamage;
		
	}
}