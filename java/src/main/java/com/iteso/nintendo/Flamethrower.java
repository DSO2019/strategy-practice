package com.iteso.nintendo;
/**
 * Class that specifyes the attack type to the pokemon.
 */
public class Flamethrower implements iAttack {

    /**
     *
     * @return name of the attack.
     */
    public final String pokeAttack() {
        String attack = "Flamethrower";
        return attack;
    }

    /**
     *
     * @return the power of the attack damage.
     */
    public int power() {
        final int power = 15;
        return power;
    }
}
