package com.iteso.nintendo.interfaces;

/**
 * Created by alex_rios on 10/03/19.
 */
public interface Attack {
    /**
     * Perform attack.
     * @return damage.
     */
    String performAttack();

    /**
     * Get attack damage.
     * @return int.
     */
    int getAttackDamage();

    /**
     * Set attack damage.
     * @param damage damage.
     */
    void setAttackDamage(int damage);
}
