package com.iteso.nintendo;

public class FirePunch implements  IAttacks {
    /**attackDamage
     * Method to get attack name.
     */
    private String attackName = "Fire Punch";
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
        final int attackDamage = 22;
        return attackDamage;
    }

}
