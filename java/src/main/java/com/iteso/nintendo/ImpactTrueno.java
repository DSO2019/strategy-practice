package com.iteso.nintendo;
/**
 * Impact Trueno attack class.
 */
public class ImpactTrueno implements IAttack {
    /**
     * Attack Damage value.
     */
    private static final int INITIAL_AD = 20;
    /**
     * Attack name.
     */
    private String attack = "Impact Trueno";
    /**
     * Attack Damage.
     */
    private int attackDamage = INITIAL_AD;
    /**
     * @return Name of the attack.
     */
    public String getAttack() {
        return attack;
    }
    /**
     * @return value of the attack.
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * @param newAttackDamage Sets new AttackDamage.
     */
    public void setAttackDamage(final int newAttackDamage) {
        this.attackDamage = newAttackDamage;
    }
}
