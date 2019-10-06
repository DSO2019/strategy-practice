package com.iteso.nintendo;

/**
 * A powerful fairy type attack.
 */
public final class Moonblast implements Attack {

     /**
     * Constructor.
     */
    private Moonblast() {

    }

    /**
     * Damage of the attack.
     */
    private static final int DAMAGE = 95;

    @Override
    public static String performAttack() {
        return "Moon blast";
    }

    @Override
    public static int getDamage() {
        return DAMAGE;
    }
}
