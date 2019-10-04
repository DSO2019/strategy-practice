package com.iteso.nintendo.attacks;

public class AquaTail implements Attack {
    static int damage;
    static String name = "Aqua Tail";

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
