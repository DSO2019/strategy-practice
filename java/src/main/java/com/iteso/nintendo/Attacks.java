package com.iteso.nintendo;

/***
 * Interfaz para hacer llamar todos los ataques.
 */
public interface Attacks {
    /**
     * Do an attack.
     * @return Attack.
     */
    String doAttack();

    /**
     * How much dmg does the attack do.
     * @return int.
     */
    int getAttackDMG();

    /**
     * Set DMG from attack.
     * @param dmg para actualizar el daño.
     */
    void setAttackDMG(int dmg);

}
