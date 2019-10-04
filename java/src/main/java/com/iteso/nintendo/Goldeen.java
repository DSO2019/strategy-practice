package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Goldeen extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 60;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.1;
    

    /**
     * Pikachu constructor.
     */
    public Goldeen() {
        Surf surf = new Surf();
        Psychic psychic = new Psychic();
        setType("water");
        setName("Goldeen");
        setHasEvolution(true);
        setSecondAttack(surf.getAttackName());
        setMainAttack(psychic.getAttackName());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(psychic.getAttackDamage());
        setSecondAttackDamage(surf.getAttackDamage());
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