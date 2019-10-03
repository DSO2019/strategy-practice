package com.iteso.nintendo.attacks;

import com.iteso.nintendo.interfaces.Attack;

/**
 * Created by alex_rios on 10/3/19.
 */
public class Surf implements Attack {
    /**
     * Surf attack starting damage.
     */
    private static final int START_DAMAGE = 80;

    /**
     * Surf attack damage.
     */
    private int damage = START_DAMAGE;

    /**
     * Perform Surf attack.
     */
    @Override
    public String performAttack() {
        return "Surf";
    }

    /**
     * Get attack damage.
     * @return damage.
     */
    @Override
    public int getAttackDamage() {
        return this.damage;
    }

    /**
     * Set attack damage.
     * @param damage
     */
    @Override
    public void setAttackDamage(final int damage0) {
        this.damage = damage0;
    }
}
