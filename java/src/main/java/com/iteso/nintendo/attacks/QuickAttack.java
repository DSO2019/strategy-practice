package com.iteso.nintendo.attacks;

import com.iteso.nintendo.Attacks;

/**
 * Clase para QuickAtack.
 */
public class QuickAttack implements Attacks {
    /**
     * Attack name.
     */
    static final String ATTACKNAME = "QuickAttack";
    /**
     * Para evitar numeros magicos.
     */
    public static final int ATTACK_DMG = 7;
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
        return  ATTACKNAME;
    }

    /**
     * How much dmg does the attack do.
     *
     * @return int.
     */
    @Override
    public int getAttackDMG() {
        return ATTACK_DMG;
    }

    /**
     * Set DMG from attack.
     */
    @Override
    public void setAttackDMG(final int dmg) {
        this.attDmg = dmg;
    }
}
