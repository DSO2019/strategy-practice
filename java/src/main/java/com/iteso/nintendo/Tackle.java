package com.iteso.nintendo;
/** Tackle attack class. */
public class Tackle implements IAttack {

    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack() {
        String attack = "Tackle";
        return attack;
    }

    /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower() {
        final int power = 10;
        return power;
    }
}
