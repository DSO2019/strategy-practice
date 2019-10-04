package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attacks;

public class AirSlash implements Attacks {
    int attackDamage = 100;
    String attackName = "AirSlash";

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
