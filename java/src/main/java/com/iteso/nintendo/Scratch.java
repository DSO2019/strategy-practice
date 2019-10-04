package com.iteso.nintendo;

public class Scratch implements Attack{

    private final String NAME = "Ataque Scratch";
    private final int DAMAGE = 18;

    @Override
    public String getAttackName(){
        return this.NAME;
    }

    @Override
    public int getAttackDamage(){
        return this.DAMAGE; 
    }
}