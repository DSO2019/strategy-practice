package com.iteso.nintendo.attacks;

import com.iteso.nintendo.Attacks;
/**
 * Clase para Tackle.
 */
public class Tackle implements Attacks {
    /**
     * Attack name.
     */
    static final String ATTACKNAME = "Tackle";
    /**
     * Para evitar numeros magicos.
     */
    public static final int ATTACK_DMG = 6;
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
