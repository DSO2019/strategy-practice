package com.iteso.nintendo;

public class razorLeaf implements attack
{
    private int damage = 55;

    @Override
    public String performAttack() {
        return "Razor Leaf";
    }

    @Override
    public int getAttackDamage() {
        return damage;
    }
    
}