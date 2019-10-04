package com.iteso.nintendo.attacks;

public class WaterGun implements Attack {
    static int damage;
    static String name = "Water Gun";

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
