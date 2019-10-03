package com.iteso.nintendo;

public interface AttackBehavior {
    
    String attack();
    public int getAttackDamage();
    public String getAttack();
    public void setAttackDamage(int newDmg);
    public void setAttack(String newAttack);
}