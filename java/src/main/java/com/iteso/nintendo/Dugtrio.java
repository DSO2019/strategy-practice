package com.iteso.nintendo;

import com.iteso.nintendo.interfaces.Attack;
import com.iteso.nintendo.attacks.Earthquake;
import com.iteso.nintendo.attacks.Dig;


/**
 * Created by alex_rios on 10/03/2019.
 */
public class Dugtrio extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 65;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.6;

    /**
     * Dugtrio constructor.
     */
    public Dugtrio() {
        Earthquake earthquake = new Earthquake();
        Dig dig = new Dig();
        setType("earth");
        setName("Dugtrio");
        setHasEvolution(true);
        setMainAttack(earthquake);
        setSecondAttack(dig);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(earthquake.getAttackDamage());
        setSecondAttackDamage(dig.getAttackDamage());
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

        String defendMessage = new String(
            "Defending attack, damage caused is " + damage
            + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;
    }

    @Override
    public final String secondAttack() {

        String attackMessage = new String(
                "Attacking opponent with " + getSecondAttack()
                + " causing a damage of " + getSecondAttackDamage());
        return attackMessage;
    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String(
                "Attacking opponent with " + getMainAttack()
                + " causing a damage of " + getMainAttackDamage());
        return attackMessage;
    }

    @Override
    public final void setNewAttack(final int attack,
    final int attackDamage, final Attack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }

}