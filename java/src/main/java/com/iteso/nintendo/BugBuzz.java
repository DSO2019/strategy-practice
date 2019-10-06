package com.iteso.nintendo;

/**
 * A powerful bug type attack.
 */
public final class BugBuzz implements Attack {

    /**
     * Constructor.
     */
    private BugBuzz() {

    }
    /**
     * Damage of the attack.
     */
    private static final int DAMAGE = 90;

    @Override
    public static String performAttack() {
        return "Bug Buzz";
    }

    @Override
    public static int getDamage() {
        return DAMAGE;
    }
}
