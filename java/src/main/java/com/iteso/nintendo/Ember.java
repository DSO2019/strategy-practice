package com.iteso.nintendo;
/**
 * Class that specifyes the attack type to the pokemon.
 */
public class Ember implements iAttack {

    /**
     *
     * @return name of the attack.
     */
    public final String pokeAttack() {
        String attack = "Ember";
        return attack;
    }

    /**
     *
     * @return the power of the attack damage.
     */
    public int power() {
        final int power = 10;
        return power;
    }
}
