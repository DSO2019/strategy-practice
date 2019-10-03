package com.iteso.nintendo;
/** Shower attack class. */
public class Shower implements IAttack {

    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack() {
        String attack = "Shower";
        return attack;
    }

    /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower() {
        final int power = 20;
        return power;
    }
}
