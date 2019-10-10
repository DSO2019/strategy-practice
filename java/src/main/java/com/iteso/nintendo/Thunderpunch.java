package com.iteso.nintendo;
/**
 * Class that specifyes the attack type to the pokemon.
 */
public class Thunderpunch implements iAttack {

    /**
     *
     * @return name of the attack.
     */
    public final String pokeAttack() {
        String attack = "Thunderpunch";
        return attack;
    }
    /**
     *
     * @return the power of the attack damage.
     */
    public int power() {
        final int power = 18;
        return power;
    }
}
