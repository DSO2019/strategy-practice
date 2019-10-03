package com.iteso.nintendo.behaviors.attack;

import com.iteso.nintendo.behaviors.attack.Attack;

public class AquaJet implements Attack {
 
    private int attackDamage = 15;
    private String attackName = "Aqua Jet";

    @Override
     public String attack() {
            return "Attacking opponent with " + attackName
                    + " causing a damage of " + attackDamage;
    }

    @Override
    public void setAttackName(String newAttackName) {
        this.attackName = newAttackName;
    }

    @Override
    public String getAttackName() {
        return this.attackName;
    }

    @Override
    public void setAttackDamage(int newAttackDamage) {
        this.attackDamage = newAttackDamage;
    } 

    @Override
    public int getAttackDamage() {
        return this.attackDamage;
    }
}
