package com.iteso.nintendo;
/**Ataque Psychic.*/
public class Psychic implements Attack {

    /**Nombre del ataque.*/
    private final String name = "Ataque Psychic";
    /**Daño del ataque.*/
    private final int damage = 17;

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
