package com.iteso.nintendo;

public class MetalClaw implements Attack{
    private int damage = 50;

    public String performAttack(){
        return "Metal Claw";
    }

    public int getDamage(){
        return damage;
    }
}
