package com.iteso.nintendo;

/**
 * A fire type attack.
 */
public final class Ember implements Attack {

     /**
     * Constructor.
     */
    private Ember() {

    }

    /**
     * Damage of the attack.
     */
    private static final int DAMAGE = 40;

    @Override
    public static String performAttack() {
        return "Ember";
    }

    @Override
    public static int getDamage() {
        return DAMAGE;
    }
}
