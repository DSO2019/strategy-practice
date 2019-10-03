package com.iteso.nintendo;
import com.iteso.nintendo.IAttack;


public class Slam implements IAttack{
    
    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack(){
        String attack = "Slam";
        return attack;
    }
        /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower(){
        return 15;
    }
}