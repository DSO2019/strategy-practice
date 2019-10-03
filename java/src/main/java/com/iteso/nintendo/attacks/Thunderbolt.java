package com.iteso.nintendo.attacks;

import com.iteso.nintendo.interfaces.Attack;

/**
 * Created by alex_rios on 10/3/19.
 */
public class Thunderbolt implements Attack {
    /**
     * Thunderbolt attack starting damage.
     */
    private static final int START_DAMAGE = 80;

    /**
     * Thunderbolt attack damage.
     */
    private int damage = START_DAMAGE;

    /**
     * Perform Thunderbolt attack.
     */
    @Override
    public String performAttack() {
        return "Thunderbolt";
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
