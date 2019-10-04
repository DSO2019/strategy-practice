package com.iteso.nintendo;

public class FutureSight implements Attack{

    private final String NAME = "Ataque Future Sight";
    private final int DAMAGE = 22;

    @Override
    public String getAttackName(){
        return this.NAME;
    }

    @Override
    public int getAttackDamage(){
        return this.DAMAGE; 
    }

}