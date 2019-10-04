package com.iteso.nintendo;

public class ElectroWeb implements Attack {

    private int damage = 55;

    public String performAttack(){
        return "Electroweb";
    }

    public int getDamage(){
        return damage;
    }
}
