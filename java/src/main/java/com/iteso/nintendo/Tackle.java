package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Tackle implements Attack {
    private int attackDamage;

    public String attack() {
        return "Tackle";
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}