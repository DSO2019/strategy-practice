package com.iteso.nintendo;

import com.iteso.nintendo.interfaces.*;
import com.iteso.nintendo.attacks.*;


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
     * Charmander constructor.
     */
    public Charmander() {
        Dig dig = new Dig();
        Earthquake earthquake = new Earthquake();
        setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        setMainAttack(dig);
        setSecondAttack(earthquake);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(dig.getAttackDamage());
        setSecondAttackDamage(earthquake.getAttackDamage());
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

        String defendMessage = new String("Defending attack, damage caused is " + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;
    }

    @Override
    public final String secondAttack() {

        String attackMessage = new String(
                "Attacking opponent with " + getSecondAttack() + " causing a damage of " + getSecondAttackDamage());
        return attackMessage;
    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String(
                "Attacking opponent with " + getMainAttack() + " causing a damage of " + getMainAttackDamage());
        return attackMessage;
    }

    @Override
    public final void setNewAttack(final int attack, final int attackDamage, final Attack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }

}
