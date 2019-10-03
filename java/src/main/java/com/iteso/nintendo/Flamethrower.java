package com.iteso.nintendo;


public class Flamethrower implements IAttack{
    
    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack(){
        String attack = "Flamethrower";
        return attack;
    }

        /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower(){
        return 25;
    }
}