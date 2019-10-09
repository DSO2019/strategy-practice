package com.iteso.nintendo;
/**
 * Big Fire attack class.
 */
public class BigFire implements IAttack {
    /**
     * Attack Damage value.
     */
    private static final int INITIAL_AD = 30;
    /**
     * Attack name.
     */
    private String attack = "Big Fire";
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
