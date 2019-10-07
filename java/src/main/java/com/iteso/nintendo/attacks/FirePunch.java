package com.iteso.nintendo.attacks;

import com.iteso.nintendo.Attacks;

/**
 * Clase para Firepunch.
 */
public class FirePunch implements Attacks {
    /**
     * Para evitar numeros magicos.
     */
    public static final int ATTACK_DMG = 8;
    /**
     * Attack name.
     */
    static final String ATTACKNAME = "Firepunch";
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
