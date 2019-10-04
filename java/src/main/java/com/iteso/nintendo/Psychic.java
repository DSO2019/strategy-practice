package com.iteso.nintendo;

public class Psychic implements Attack{

    private final String NAME = "Ataque Psychic";
    private final int DAMAGE = 17;

    @Override
    public String getAttackName(){
        return this.NAME;
    }

    @Override
    public int getAttackDamage(){
        return this.DAMAGE;
    }

}