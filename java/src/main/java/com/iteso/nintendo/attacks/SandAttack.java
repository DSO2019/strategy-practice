package com.iteso.nintendo.attacks;

public class SandAttack implements Attack {
    static int damage = 30;
    static String name = "SandAttack";

    @Override
    public String attackName() {
        return this.name;
    }

    @Override
    public int attackDamage() {
        return this.damage;
    }

}
