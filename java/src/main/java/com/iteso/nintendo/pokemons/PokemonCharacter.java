package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.behaviors.AttackBehavior;

/**
 * Created by rvillalobos on 2/24/18.
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
     * Multiplier to calculate damage received.
     */
    private double defenseMultiplier = 0;
    /**
     * Pokemon life.
     */
    private int hitPoints = 0;

    public AttackBehavior mainAttack;
    public AttackBehavior secondAttack;
    ;
    public void setMainAttackBehavior(AttackBehavior ab){
        this.mainAttack = ab;
    }

    public void setSecondaryAttackBehavior(AttackBehavior ab2){
        this.secondAttack = ab2;
    }
    /**
     * Get pokemon name.
     * @return Name.
     */
    public final String getName() {
        return name;
    }

    /**
     * Set pokemon name.
     * @param newName New name.
     */
    public final void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Method to perform evolution.
     * @return Result of evolution.
     */
    public abstract String evolve();

    /**
     * Method to defend an attack.
     * @param attackDamage Amount of damage to defend.
     * @return Result of defense.
     */
    public abstract String defend(int attackDamage);

    /**
     * Pokemon type.
     * @return water, fire, normal, electric, plant, bug, etc.
     */
    public final String getType() {
        return type;
    }

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

    public abstract void setNewAttack(int attack, AttackBehavior newAttack);

    /**
     * Set new pokemon type.
     * @param newType new pokemon type.
     */
    public final void setType(final String newType) {
        this.type = newType;
    }

    /**
     * Indicate if pokemon can be evolved.
     * @return true or false.
     */
    public final boolean isHasEvolution() {
        return hasEvolution;
    }

    /**
     * Set indicator of evolution.
     * @param evolution set to true if pokemon can be evolved.
     */
    public final void setHasEvolution(final boolean evolution) {
        this.hasEvolution = evolution;
    }

    /**
     * Get name of main attack.
     * @return main attack name.
     */
    public final String getMainAttack() {
        return this.mainAttack.getAttack();
    }

    /**
     * Get name of second attack.
     * @return name of second attack.
     */
    public final String getSecondAttack() {
        return this.secondAttack.getAttack();
    }
    
    /**
     * Get damage of main attack.
     * @return main attack damage.
     */
    public final int getMainAttackDamage() {
        return this.mainAttack.getAttackDamage();
    }

    /**
     * Set main attack new damage.
     * @param newMainAttackDamage new main attack damage.
     */
    public final void setMainAttackDamage(final int newMainAttackDamage) {
        this.mainAttack.setAttackDamage(newMainAttackDamage);
    }

    /**
     * Get second attack damage.
     * @return second attack damage.
     */
    public final int getSecondAttackDamage() {
        return this.secondAttack.getAttackDamage();
    }

    /**
     * Set new second attack damage.
     * @param newSecondAttackDamage new second attack damage.
     */
    public final void setSecondAttackDamage(final int newSecondAttackDamage) {
        this.secondAttack.setAttackDamage(newSecondAttackDamage);
    }

    /**
     * Get defense multiplier.
     * @return defense multiplier.
     */
    public final double getDefenseMultiplier() {
        return defenseMultiplier;
    }

    /**
     * Set new defense mul;tiplier.
     * @param newDefenseMultiplier new defense multiplier.
     */
    public final void setDefenseMultiplier(final double newDefenseMultiplier) {
        this.defenseMultiplier = newDefenseMultiplier;
    }

    /**
     * Get hit points.
     * @return hit points.
     */
    public final int getHitPoints() {
        return hitPoints;
    }

    /**
     * Set new het points.
     * @param newHitPoints new hit points.
     */
    public final void setHitPoints(final int newHitPoints) {
        this.hitPoints = newHitPoints;
    }

}
