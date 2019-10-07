package com.iteso.nintendo;
/**Ataque Water Gun.*/
public class WaterGun implements Attack {

    /**Nombre del ataque.*/
    private final String name = "Ataque Water Gun";
    /**Daño del ataque.*/
    private final int damage = 25;

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
