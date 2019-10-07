package com.iteso.nintendo;
/**Ataque Future Sight.*/
public class FutureSight implements Attack {

    /**Nombre del ataque.*/
    private final String  name = "Ataque Future Sight";
    /**Daño del ataque.*/
    private final int damage = 22;

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
