package com.iteso.nintendo;
/**Ataque Scratch.*/
public class Scratch implements Attack {

    /**Nombre del ataque.*/
    private final String name = "Ataque Scratch";
    /**Daño del ataque.*/
    private final int damage = 18;

    /**@return Nombre del ataque.*/
    @Override
    public String getAttackName() {
        return this.name;
    }

    /**@return Daño del ataque.*/
    @Override
    public int getAttackDamage() {
        return this.damage;
    }
}
