package com.iteso.nintendo;
/** Impacthunder attack class. */
public class Impacthunder implements IAttack {

    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack() {
        String attack = "Impacthunder";
        return attack;
    }

        /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower() {
        final int power = 25;
        return power;
    }
}
