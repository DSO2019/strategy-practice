package com.iteso.nintendo;

/** FireSpin attack class. */
public class FireSpin implements IAttack {

    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack() {
        String attack = "FireSpin";
        return attack;
    }

        /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower() {
        final int power = 7;
        return power;
    }
}
