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
    public final int Power() {
        static final int Power = 10;
        return Power;
    }
}
