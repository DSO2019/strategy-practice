package com.iteso.nintendo;

public class TriAttack implements InterfaceMainAttack{
private int attackDamage;

public String attack(){
	return "TriAttack";
}


public int attackDamage() {
	return 22;
	
}

public void setAttackDamage(int attackDamage) {
	this.attackDamage=attackDamage;
	
}
	

}