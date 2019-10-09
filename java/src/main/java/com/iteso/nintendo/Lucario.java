package com.iteso.nintendo;
/**
 * Created by rvillalobos on 2/24/18.
 */
public class Lucario extends PokemonCharacter {
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
    public Lucario() {
        setType("fighter");
        setName("Lucario");
        setHasEvolution(true);
        setSecondaryAttackBehavior(new QuickAttackBehavior());
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
        return this.getSecondAttackBehavior().attack();
    }

    @Override
    public final String mainAttack() {
        return this.getMainAttackBehavior().attack();
    }

    @Override
    public final void setNewAttack(final int attack,
                                    final AttackBehavior newBeh) {
        if (attack == 1) {
            this.setMainAttackBehavior(newBeh);
        } else {
            this.setSecondaryAttackBehavior(newBeh);
        }
    }
}