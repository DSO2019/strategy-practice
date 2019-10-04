package com.iteso.nintendo;

public class WaterGun implements Attack{

    private final String NAME = "Ataque Water Gun";
    private final int DAMAGE = 25;

    @Override
    public String getAttackName(){
        return this.NAME;
    }

    @Override
    public int getAttackDamage(){
        return this.DAMAGE; 
    }
}
