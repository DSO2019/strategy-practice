package com.iteso.nintendo.attacks;

import com.iteso.nintendo.attacks.Attack;

public class ImpactThunder implements Attack {
    static int damage;
    private static final String name = "Impact Thunder";

    @Override
    public String attackName() {
        return name;
    }

    @Override
    public int attackDamage() {
        return this.damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
