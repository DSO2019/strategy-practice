package com.iteso.nintendo;

import com.iteso.nintendo.interfaces.Attack;

/**
 * Created by alex_rios on 10/03/2019.
 */
public abstract class PokemonCharacter {

    /**
     * Pokemon name.
     */
    private String name = null;
    /**
     * Pokemon type.
     */
    private String type = null;
    /**
     * Indicator of evolution.
     */
    private boolean hasEvolution = false;
    /**
     * Main attack name.
     */
    private Attack mainAttack;
    /**
     * Second attack name.
     */
    private Attack secondAttack;
    /**
     * Multiplier to calculate damage received.
     */
    private double defenseMultiplier = 0;
    /**
     * Pokemon life.
     */
    private int hitPoints = 0;

    /**
     * Get pokemon name.
     *
     * @return Name.
     */
    public final String getName() {
        return name;
    }

    /**
     * Set pokemon name.
     *
     * @param newName New name.
     */
    public final void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Method to perform evolution.
     *
     * @return Result of evolution.
     */
    public abstract String evolve();

    /**
     * Method to defend an attack.
     *
     * @param attackDamage Amount of damage to defend.
     * @return Result of defense.
     */
    public abstract String defend(int attackDamage);

    /**
     * Method to perform second attack.
     *
     * @return Result of attack.
     */
    public abstract String secondAttack();

    /**
     * Method to perform main attack.
     *
     * @return Result of main attack.
     */
    public abstract String mainAttack();

    /**
     * Method to change pokemon attack.
     *
     * @param attack       Which attack to change.
     * @param attackDamage New damage.
     * @param newAttack    New attack name.
     */
    public abstract void setNewAttack(int attack,
    int attackDamage, Attack newAttack);

    /**
     * Pokemon type.
     *
     * @return water, fire, normal, electric, plant, bug, etc.
     */
    public final String getType() {
        return type;
    }

    /**
     * Set new pokemon type.
     *
     * @param newType new pokemon type.
     */
    public final void setType(final String newType) {
        this.type = newType;
    }

    /**
     * Indicate if pokemon can be evolved.
     *
     * @return true or false.
     */
    public final boolean isHasEvolution() {
        return hasEvolution;
    }

    /**
     * Set indicator of evolution.
     *
     * @param evolution set to true if pokemon can be evolved.
     */
    public final void setHasEvolution(final boolean evolution) {
        this.hasEvolution = evolution;
    }

    /**
     * Get name of main attack.
     *
     * @return main attack name.
     */
    public final String getMainAttack() {
        return mainAttack.performAttack();
    }

    /**
     * Set name of main attack.
     *
     * @param newMainAttack new main attack name.
     */
    public final void setMainAttack(final Attack newMainAttack) {
        this.mainAttack = newMainAttack;
    }

    /**
     * Get name of second attack.
     *
     * @return name of second attack.
     */
    public final String getSecondAttack() {
        return secondAttack.performAttack();
    }

    /**
     * Set name of second attack.
     *
     * @param newSecondAttack new second attack name.
     */
    public final void setSecondAttack(final Attack newSecondAttack) {
        this.secondAttack = newSecondAttack;
    }

    /**
     * Get damage of main attack.
     *
     * @return main attack damage.
     */
    public final int getMainAttackDamage() {
        return mainAttack.getAttackDamage();
    }

    /**
     * Set main attack new damage.
     *
     * @param newMainAttackDamage new main attack damage.
     */
    public final void setMainAttackDamage(final int newMainAttackDamage) {
        this.mainAttack.setAttackDamage(newMainAttackDamage);
    }

    /**
     * Get second attack damage.
     *
     * @return second attack damage.
     */
    public final int getSecondAttackDamage() {
        return secondAttack.getAttackDamage();
    }

    /**
     * Set new second attack damage.
     *
     * @param newSecondAttackDamage new second attack damage.
     */
    public final void setSecondAttackDamage(final int newSecondAttackDamage) {
        this.secondAttack.setAttackDamage(newSecondAttackDamage);
    }

    /**
     * Get defense multiplier.
     *
     * @return defense multiplier.
     */
    public final double getDefenseMultiplier() {
        return defenseMultiplier;
    }

    /**
     * Set new defense mul;tiplier.
     *
     * @param newDefenseMultiplier new defense multiplier.
     */
    public final void setDefenseMultiplier(final double newDefenseMultiplier) {
        this.defenseMultiplier = newDefenseMultiplier;
    }

    /**
     * Get hit points.
     *
     * @return hit points.
     */
    public final int getHitPoints() {
        return hitPoints;
    }

    /**
     * Set new het points.
     *
     * @param newHitPoints new hit points.
     */
    public final void setHitPoints(final int newHitPoints) {
        this.hitPoints = newHitPoints;
    }

}
