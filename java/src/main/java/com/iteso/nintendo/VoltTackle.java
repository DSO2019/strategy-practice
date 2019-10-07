package com.iteso.nintendo;
/**Ataque Volt Tackle.*/
public class VoltTackle implements Attack {

    /**Nombre del ataque.*/
    private final String name = "Ataque VoltTackle";
    /**Daño del ataque.*/
    private final int damage = 23;

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
