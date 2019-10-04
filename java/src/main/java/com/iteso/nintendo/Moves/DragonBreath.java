package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attacks;

public class DragonBreath implements Attacks {
    int attackDamage = 60;
    String attackName = "DragonBreath";

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
