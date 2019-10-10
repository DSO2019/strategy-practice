package com.iteso.nintendo.attacks;

import com.iteso.nintendo.Attack;

public class Burbuja implements Attack {
    int attackDamage = 12;
    String attackName = "Burbuja";

    @Override
    public  String attackName() {
        return attackName;
    }

    @Override
    public int attackDamage() {
        return attackDamage;
    }
}
