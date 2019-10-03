package com.iteso.nintendo;

public class Earthquake implements IAttacks {
    /**
     * Method to get attack name.
     */
    private String attackName = "Earthquake";

    /**
     * Method to get attack name.
     * @return attack.
     */
    public String getAttackName() {
        return this.attackName;
    }

    /**
     * Method to get attack damage.
     * @return attack damage.
     */
    public int getAttackDamage() {
        final int attackDamage = 25;
        return attackDamage;
    }

}
