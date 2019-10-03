package com.iteso.nintendo.attacks;
import com.iteso.nintendo.interfaces.*;

public class Psychic implements Attack {
    private int damage = 80;

    @Override
    public String performAttack() {
        return "Psychic";
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