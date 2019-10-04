package com.iteso.nintendo;

public class BugBuzz implements Attack{
    private int damage = 90;

    public String performAttack(){
        return "Bug Buzz";
    }

    public int getDamage(){
        return damage;
    }
}
