package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attacks;

public class Flamethrower implements Attacks {
    int attackDamage = 40;
    String attackName = "Flamethrower";

    @Override
    public String attackName() {
        return attackName;
    }

    @Override
    public void setAttackName(String attackName) {

    }

    @Override
    public int attackDamage() {
        return attackDamage;
    }

    @Override
    public void setAttackDamage(int attackDamage1) {
        this.attackDamage = attackDamage1;
    }
}
