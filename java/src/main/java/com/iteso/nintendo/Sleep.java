package com.iteso.nintendo;

public class Sleep implements  IAttacks {
    /**
     * Method to get attack name.
     */
    private int attackDamage = 0;
    /**
     * Method to get attack name.
     */
    private String attackName = "Sleep";

    /**attackDamage
     * Method to get attack name.
     * @return attackName.
     */
    public String getAttackName() {
        return this.attackName;
    }

    /**
     * Method to get attack damage.
     * @return attackDamage.
     */
    public int getAttackDamage() {
        return attackDamage;
    }
}
