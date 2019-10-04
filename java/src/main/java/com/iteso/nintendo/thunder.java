package com.iteso.nintendo;

public class thunder implements attack
{
    private int damage = 110;

    public String performAttack()
    {
        return "Thunder";
    }

    public int getAttackDamage()
    {
        return damage;
    }
}