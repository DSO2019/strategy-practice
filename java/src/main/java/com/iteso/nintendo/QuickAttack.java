package com.iteso.nintendo;
/**
 * Quick Attack class.
 */
public class QuickAttack implements IAttack {
    /**
     * Attack name.
     */
    private String attack;
    /**
     * Attack Damage.
     */
    private int attackDamage;
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
