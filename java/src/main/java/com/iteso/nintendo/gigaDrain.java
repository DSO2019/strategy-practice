package com.iteso.nintendo;

public class gigaDrain implements attack
{
    private int damage = 75;

    @Override
    public String performAttack() {
        return "Giga drain";
    }

    @Override
    public int getAttackDamage() {
        return damage;
    }
    
}