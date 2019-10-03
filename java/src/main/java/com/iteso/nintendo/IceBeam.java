package com.iteso.nintendo;

public class IceBeam implements  IAttacks {
     /**
     * Method to get attack name.
     * @return attack.
     */
    private String attackName = "Ice Beam";

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
        final int attackDamage = 18;
        return attackDamage;
    }
}
