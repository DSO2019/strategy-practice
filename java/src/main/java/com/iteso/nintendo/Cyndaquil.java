package com.iteso.nintendo;

import com.iteso.nintendo.Moves.BoltStrike;
import com.iteso.nintendo.Moves.FireBlast;
import com.iteso.nintendo.Moves.Flamethrower;
import com.iteso.nintendo.Moves.ThunderBolt;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Cyndaquil extends PokemonCharacter {
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
    public Cyndaquil() {
        FireBlast fireBlast = new FireBlast();
        Flamethrower flamethrower = new Flamethrower();
        setType("fire");
        setName("Cyndaquil");
        setHasEvolution(true);
        setSecondAttack(fireBlast);
        setMainAttack(flamethrower);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(fireBlast.attackDamage());
        setSecondAttackDamage(flamethrower.attackDamage());
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

    @Override
    public void setNewAttack(int attack, int attackDamage, Attacks newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }


    @Override
    public String attackName() {
        return null;
    }

    @Override
    public void setAttackName(String attackName) {

    }

    @Override
    public int attackDamage() {
        return 0;
    }

    @Override
    public void setAttackDamage(int attackDamage) {

    }
}
