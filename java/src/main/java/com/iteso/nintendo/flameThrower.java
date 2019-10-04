package com.iteso.nintendo;

class flameThrower implements attack
{
    private int damage = 90;

    public String performAttack()
    {
        return "Flame Thrower";
    }

    public int getAttackDamage() {
        return damage;
    }
}