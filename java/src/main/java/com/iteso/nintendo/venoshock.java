package com.iteso.nintendo;

public class venoshock implements attack
{
    private int damage = 65;

    @Override
    public String performAttack() {
        return "Venoshock";
    }

    @Override
    public int getAttackDamage() {
        return damage;
    }
    
}