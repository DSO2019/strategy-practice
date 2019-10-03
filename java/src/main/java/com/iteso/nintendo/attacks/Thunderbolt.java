package com.iteso.nintendo.attacks;
import com.iteso.nintendo.interfaces.*;

public class Thunderbolt implements Attack {
    private int damage = 90;

    @Override
    public String performAttack() {
        return "Thunderbolt";
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