package com.iteso.nintendo;

public class ShadowBall implements InterfaceMainAttack{


	private int attackDamage;

	public String attack(){
		return "ShadowBall";
	}


	public int attackDamage() {
		return 25;
		
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage=attackDamage;
		
	}
}