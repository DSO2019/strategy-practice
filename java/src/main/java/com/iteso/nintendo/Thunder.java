package com.iteso.nintendo;

/**
 * A very powerful electric type attack.
 */
public final class Thunder implements Attack {

     /**
     * Constructor.
     */
    private Thunder() {

    }

    /**
     * Damage of the attack.
     */
    private static final int DAMAGE = 110;

    @Override
    public static String performAttack() {
        return "Thunder";
    }

    @Override
    public static int getDamage() {
        return DAMAGE;
    }
}
