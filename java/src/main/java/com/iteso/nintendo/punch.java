package com.iteso.nintendo;

public class punch implements attack
{
    private int damage = 20;

    public String performAttack()
    {
        return "Punch";
    }
    public int getAttackDamage()
    {
        return damage;
    }
}