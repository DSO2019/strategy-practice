package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Porygon extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.7;
    /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 6;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 22;

    /**
     * Porygon constructor.
     */
    public Porygon() {
        setType("normal");
        setName("Porygon");
        setHasEvolution(true);
        InterfaceMainAttack mainAttack = new TriAttack();
        InterfaceMainAttack secondAttack = new ShadowBall();
        setSecondAttack(secondAttack);
        setMainAttack(mainAttack);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        mainAttack.setAttackDamage(MAIN_ATTACK_DAMAGE);
        secondAttack.setAttackDamage(SECOND_ATTACK_DAMAGE);
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
                "Attacking opponent with " + getSecondAttack().attack() + " causing a damage of " + getSecondAttack().attackDamage());
        return attackMessage;

    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String(
                "Attacking opponent with " + getMainAttack().attack() + " causing a damage of " + getMainAttack().attackDamage());
        return attackMessage;

    }

    @Override
    public final void setNewAttack(final int attack, final int attackDamage, final InterfaceMainAttack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            getMainAttack().setAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            getSecondAttack().setAttackDamage(attackDamage);
        }
    }

	

}