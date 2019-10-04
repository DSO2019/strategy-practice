package com.iteso.nintendo;
/**
 * Impact Trueno attack class
 */
public class ImpactTrueno implements IAttack{
	/***
	 * Attack name
	 */
	private String attack;
	private int attackDamage;
	
    /**
     * @return Name of the attack
     */
    public String getAttack(){
        return attack;
    }
    
    /**
     * @return value of the attack
     */
    public int getAttackDamage(){
        return attackDamage;
    }

    /**
     * Sets new AttackDamage
     */
	public void setAttackDamage(int newAttackDamage) {
		this.attackDamage = newAttackDamage;		
	}
    
}