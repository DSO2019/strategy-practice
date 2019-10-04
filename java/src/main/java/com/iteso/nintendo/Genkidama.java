package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Genkidama implements Attack {
    private int attackDamage;

    public String attack() {
        return "Genkidama";
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}