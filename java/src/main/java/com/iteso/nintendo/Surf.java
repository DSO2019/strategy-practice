package com.iteso.nintendo;
/**Ataque Surf.*/
public class Surf implements Attack {

    /**Nombre del ataque.*/
    private final String name = "Ataque Surf";
    /**Daño del ataque.*/
    private final int damage = 10;

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
