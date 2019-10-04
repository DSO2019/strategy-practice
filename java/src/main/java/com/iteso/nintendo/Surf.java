package com.iteso.nintendo;

public class Surf implements Attack{

    private final String NAME = "Ataque Surf";
    private final int DAMAGE = 10;

    @Override
    public String getAttackName(){
        return this.NAME;
    }

    @Override
    public int getAttackDamage(){
        return this.DAMAGE; 
    }
}