package com.iteso.nintendo;

/**
 * A steel type attack.
 */
public final class MetalClaw implements Attack {

     /**
     * Constructor.
     */
    private MetalClaw() {

    }

    /**
     * Damage of the attack.
     */
    private static final int DAMAGE = 50;

    @Override
    public static String performAttack() {
        return "Metal Claw";
    }

    @Override
    public static int getDamage() {
        return DAMAGE;
    }
}
