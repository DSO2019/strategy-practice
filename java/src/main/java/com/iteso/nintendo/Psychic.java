package com.iteso.nintendo;
/**
 * Class that specifyes the attack type to the pokemon.
 */
public class Psychic implements iAttack {

    /**
     *
     * @return name of the attack.
     */
    public final String pokeAttack() {
        String attack = "Psychic";
        return attack;
    }

    /**
     *
     * @return the power of the attack damage.
     */
    public int power() {
        final int power = 20;
        return power;
    }
}
