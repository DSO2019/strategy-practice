package com.iteso.nintendo;

/**
 * An attack for a pokemon.
 */
public interface Attack {

    /**
     * Perform the pokemon attack.
     * @return string with the name of the attack.
     */
    String performAttack();

    /**
     * Get the damage of the attack.
     * @return integer with the damage.
     */
    int getDamage();

}
