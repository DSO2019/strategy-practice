package com.iteso.nintendo;
import com.iteso.nintendo.IAttack;

public class Shower implements IAttack{
    
    /**
     * Method to perform attack.
     * @return Result of attack.
     */
    public final String performAttack(){
        String attack = "Shower";
        return attack;
    }
        
    /**
     * Method to return attack power.
     * @return Power of attack.
     */
    public final int attackPower(){
        return 20;
    }
}