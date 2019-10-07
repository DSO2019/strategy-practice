package com.iteso.nintendo;
/**
 * Interface of the pokemon attack.
 * */
public interface IAttack {
     /**
     * @return Main attack name.
     */
    String getAttack();
    /**
     * @return number of attack damage.
     */
    int getAttackDamage();
    /**
     * @param newAttackDamage sets a new Attack Damage.
     */
    void setAttackDamage(int newAttackDamage);
}
