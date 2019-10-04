package com.iteso.nintendo.attacks;

import com.iteso.nintendo.Attacks;

public class QuickAttack implements Attacks {
    /**
     * Attack name.
     */
    static final String ATTACKNAME = "QuickAttack";
    /**
     * Attack dmg.
     */
    private static int attDmg;

    /**
     * Do an attack.
     *
     * @return Attack.
     */
    @Override
    public String doAttack() {
        return " ha usado" + ATTACKNAME;
    }

    /**
     * How much dmg does the attack do.
     *
     * @return int.
     */
    @Override
    public int getAttackDMG() {
        return 7;
    }

    /**
     * Set DMG from attack
     */
    @Override
    public void setAttackDMG(int dmg) {
        this.attDmg = dmg;
    }
}
