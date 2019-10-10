package com.iteso.nintendo;

/**
 * Created by el diablo on 2/24/18.
 */
public interface Attack {
    /**
     * @param attackDamage attack damage
     */
    void setAttackDamage(int attackDamage);

    /**
     * @return attack damage
     */
    int getAttackDamage();

    /**
     * @return attack name
     */
    String attack();
}
