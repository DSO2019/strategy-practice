package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.behaviors.AttackBehavior;
import com.iteso.nintendo.behaviors.BigFireBehavior;
import com.iteso.nintendo.behaviors.SmallFireBehavior;
/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;
    /**
     * Pikachu constructor.
     */
    public Charmander() {
        setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        setSecondaryAttackBehavior(new BigFireBehavior());
        setMainAttackBehavior(new SmallFireBehavior());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final int attack) {
        int damage;

        damage = (int) (attack * getDefenseMultiplier());
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    @Override
    public final String secondAttack() {
        return this.secondAttack.attack();
    }

    @Override
    public final String mainAttack() {
        return this.mainAttack.attack();
    }

    @Override
    public final void setNewAttack(final int attack, AttackBehavior newBehavior) {
        if (attack == 1) {
            this.mainAttack = newBehavior;
        } else {
            this.secondAttack = newBehavior;
        }
    }
}
