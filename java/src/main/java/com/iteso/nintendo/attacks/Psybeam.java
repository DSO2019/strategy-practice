package com.iteso.nintendo.attacks;

public class Psybeam implements Attack {
    static int damage;
    private static final String name = "Psybeam";

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
