package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public interface AttackBehavior {
    /**
     * @return the attack.
     */
    String attack();
    /**
     * @return attack damage.
     */
    int getAttackDamage();
    /**
     * @return attack name.
     */
    String getAttack();
    /**
     * sets attack.
     * @param newDmg new damage.
     */
    void setAttackDamage(int newDmg);
    /**
     * @param newAttack new attack name.
     */
    void setAttack(String newAttack);
}
