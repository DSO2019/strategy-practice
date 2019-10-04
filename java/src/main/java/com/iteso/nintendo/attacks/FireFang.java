package com.iteso.nintendo.attacks;

import com.iteso.nintendo.attacks.Attack;

public class FireFang implements Attack {
    static int damage;
    static String name = "Fire Fang";

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
