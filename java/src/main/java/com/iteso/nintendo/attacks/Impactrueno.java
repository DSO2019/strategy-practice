package com.iteso.nintendo.attacks;

import com.iteso.nintendo.Attack;

public class Impactrueno implements Attack {

    int attackDamage = 5;
    String attackName = "Impactrueno";

    @Override
    public  String attackName() {
        return attackName;
    }

    @Override
    public int attackDamage() {
        return attackDamage;
    }
}
