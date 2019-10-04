package com.iteso.nintendo;

public class VoltTackle implements Attack{

    private final String NAME = "Ataque VoltTackle";
    private final int DAMAGE = 23;

    @Override
    public String getAttackName(){
        return this.NAME;
    }

    @Override
    public int getAttackDamage(){
        return this.DAMAGE; 
    }
}