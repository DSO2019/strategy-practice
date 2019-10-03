package com.iteso.nintendo;

public class Thunderbolt implements IAttacks {
      /**attackDamage
     * Method to get attack name.*/
    private String attackName = "Thunderbolt";

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
        final int attackDamage = 24;
        return attackDamage;
    }
}
