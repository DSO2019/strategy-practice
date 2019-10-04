package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Hadouken implements Attack {
    private int attackDamage;

    public String attack() {
        return "Hadouken";
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}