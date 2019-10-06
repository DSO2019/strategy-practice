package com.iteso.nintendo;

/**
 * A practical electric type attack.
 */
public final class ElectroWeb implements Attack {

    /**
     * Constructor.
     */
    private ElectroWeb() {

    }

    /**
     * Damage of the attack.
     */
    private static final int DAMAGE = 55;

    @Override
    public static String performAttack() {
        return "Electroweb";
    }

    @Override
    public static int getDamage() {
        return DAMAGE;
    }
}
