package com.iteso.nintendo.attacks;

public class Hex implements Attack {
    static int damage;
    private static final String name = "Hex";

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
