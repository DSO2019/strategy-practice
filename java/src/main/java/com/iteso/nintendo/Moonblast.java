package com.iteso.nintendo;

public class Moonblast implements Attack{
    private int damage = 95;

    public String performAttack(){
        return "Moon blast";
    }

    public int getDamage(){
        return damage;
    }
}
