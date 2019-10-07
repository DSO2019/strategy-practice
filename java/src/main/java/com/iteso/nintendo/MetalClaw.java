package com.iteso.nintendo;
/**
 * Class that specifyes the attack type to the pokemon.
 */
public class MetalClaw implements iAttack {

    /**
     *
     * @return name of the attack.
     */
    public final String pokeAttack() {
        String attack = "Metal Claw";
        return attack;
    }

    /**
     *
     * @return the power of the attack damage.
     */
    public final int Power() {
        final int power = 12;
        return power;
    }
}
