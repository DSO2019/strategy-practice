package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attacks;

public class BoltStrike implements Attacks {
    int attackDamage = 40;
    String attackName = "BoltStrike";

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
