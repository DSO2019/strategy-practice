package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attacks;

public class Aeroblast implements Attacks {
    int attackDamage = 80;
    String attackName = "Aeroblast";

    @Override
    public String attackName() {
        return attackName;
    }

    @Override
    public void setAttackName(String attackName) {

    }

    @Override
    public int attackDamage() {

        return this.attackDamage;
    }

    @Override
    public void setAttackDamage(int attackDamage1) {
        this.attackDamage = attackDamage1;
    }
}
