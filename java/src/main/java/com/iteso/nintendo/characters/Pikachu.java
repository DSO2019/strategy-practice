package com.iteso.nintendo.characters;

import com.iteso.nintendo.behaviors.attack.ImpactTruenoAttack;
import com.iteso.nintendo.behaviors.attack.QuickAttack;
import com.iteso.nintendo.behaviors.attack.Attack;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Pikachu extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;

    /**
     * Pikachu constructor.
     */
    public Pikachu() {
        setType("electric");
        setName("Pikachu");
        setHasEvolution(true);
        setSecondAttack(new ImpactTruenoAttack());
        setMainAttack(new QuickAttack());
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
        return getSecondAttack().attack();
    }

    @Override
    public final String mainAttack() {
        return getMainAttack().attack();
    }

    @Override
    public final void setNewAttack(final int attack, final Attack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }



}
