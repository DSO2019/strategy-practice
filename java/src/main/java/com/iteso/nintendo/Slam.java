package com.iteso.nintendo;
/** Slam attack class. */
public class Slam implements IAttack {

    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack() {
        String attack = "Slam";
        return attack;
    }
    /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower() {
        final int power = 15;
        return power;
    }
}
