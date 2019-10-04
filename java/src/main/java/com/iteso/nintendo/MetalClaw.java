package com.iteso.nintendo;

public class MetalClaw implements InterfaceMainAttack{


	private int attackDamage;

	public String attack(){
		return "MetalClaw";
	}


	public int attackDamage() {
		return 16;
		
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage=attackDamage;
		
	}
}