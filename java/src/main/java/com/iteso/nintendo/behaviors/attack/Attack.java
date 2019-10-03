package com.iteso.nintendo.behaviors.attack;

public interface Attack {
    String attack();
    void setAttackName(String attackName);
    String getAttackName();
    void setAttackDamage(int attackDamage);
    int getAttackDamage();
}
