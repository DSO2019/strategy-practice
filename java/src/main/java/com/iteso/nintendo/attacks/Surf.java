package com.iteso.nintendo.attacks;
import com.iteso.nintendo.interfaces.*;

public class Surf implements Attack {
    private int damage = 80;

    @Override
    public String performAttack() {
        return "Surf";
    }

    @Override
    public int getAttackDamage() {
        return this.damage;
    }

    @Override
    public void setAttackDamage(final int damage) {
        this.damage = damage;
    }
}