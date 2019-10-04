package com.iteso.nintendo;

public class Ember implements Attack{
    private int damage = 40;

    public String performAttack(){
        return "Ember";
    }

    public int getDamage(){
        return damage;
    }
}
