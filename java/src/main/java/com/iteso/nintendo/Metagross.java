package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Metagross extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;
     /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 12;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 20;

    /**
     * Metagross constructor.
     */
    public Metagross() {
        MetalClaw metalClaw = new MetalClaw();
        Psychic psychic = new Psychic();
        setType("psychic steel");
        setName("Metagross");
        setHasEvolution(true);
        setMainAttack(metalClaw.pokeAttack());
        setSecondAttack(psychic.pokeAttack());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(metalClaw.Power());
        setSecondAttackDamage(psychic.Power());
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
    public final void setNewAttack(final int attack, final int attackDamage,
                                   final String newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }


}