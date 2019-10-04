package com.iteso.nintendo;

public class confusion implements attack
{
    private int damage = 50;

    public String performAttack() {
        return "Confusion";
    }

    @Override
    public int getAttackDamage() {
        return damage;
    }
    
}