package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.Attacks;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.attacks.FirePunch;
import com.iteso.nintendo.attacks.QuickAttack;
import com.iteso.nintendo.attacks.Tackle;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;
    /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 5;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 15;

    /**
     * Pikachu constructor.
     */
    public Charmander() {
        Tackle tackle = new Tackle();
        FirePunch firePunch = new FirePunch();
        setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(tackle);
        setMainAttack(firePunch);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(firePunch.getAttackDMG());
        setSecondAttackDamage(tackle.getAttackDMG());
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

        String attackMessage = new String("Attacking opponent with "
                + getSecondAttack()
                + " causing a damage of " + getSecondAttackDamage());
        return attackMessage;


    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String("Attacking opponent with "
                + getMainAttack()
                + " causing a damage of " + getMainAttackDamage());
        return attackMessage;

    }

    /**
     * Method to change pokemon attack.
     *
     * @param attack       Which attack to change.
     * @param attackDamage New damage.
     * @param newAttack    New attack name.
     */
    @Override
    public final void setNewAttack(final int attack, final int attackDamage,
                                   final Attacks newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }

    }


}
