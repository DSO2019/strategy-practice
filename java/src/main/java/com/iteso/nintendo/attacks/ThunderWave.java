package com.iteso.nintendo.attacks;

public class ThunderWave implements Attack {
    static int damage;
    static String name = "Thunder Wave";

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
