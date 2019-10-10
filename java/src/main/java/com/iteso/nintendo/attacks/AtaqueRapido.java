package com.iteso.nintendo.attacks;

import com.iteso.nintendo.Attack;

public class AtaqueRapido implements Attack {
    int attackDamage = 8;
    String attackName = "Ataque Rápido";

    @Override
    public  String attackName() {
        return attackName;
    }

    @Override
    public int attackDamage() {
        return attackDamage;
    }
}
