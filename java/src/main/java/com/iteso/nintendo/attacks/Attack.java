package com.iteso.nintendo.attacks;

public interface Attack {
    String attackName ();

    int attackDamage ();

    void setDamage(int damage);
}
