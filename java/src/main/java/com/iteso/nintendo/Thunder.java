package com.iteso.nintendo;

public class Thunder implements Attack {

    private int damage = 110;

    public String performAttack(){
        return "Thunder";
    }

    public int getDamage(){
        return damage;
    }
}
