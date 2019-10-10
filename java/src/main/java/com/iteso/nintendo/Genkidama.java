package com.iteso.nintendo;

/**
 * Created by satanas on 2/24/18.
 */
public class Genkidama implements Attack {
    /**
     * attack damage.
     */
    private int attackDamage;

    /**
     * @return attack name.
     */
    public String attack() {
        return "Genkidama";
    }

    /**
     * @return attack damage.
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * @param damage attack damage.
     */
    public void setAttackDamage(final int damage) {
        attackDamage = damage;
    }
}
