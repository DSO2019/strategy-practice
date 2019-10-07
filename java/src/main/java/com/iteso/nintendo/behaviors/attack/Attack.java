package com.iteso.nintendo.behaviors.attack;

/** Inferfaz ataque. */
public interface Attack {
    /**
        Método para atacar.
        @return String Log del ataque.
     */
    String attack();

    /**
        Método para actualizar el nombre
        del ataque.
        @param attackName Nuevo nombre del ataque.
     */
    void setAttackName(String attackName);

    /**
        Método que obtener el nombre del ataque.
        @return String Nombre del ataque.
    */
    String getAttackName();

    /**
        Método se actuliza el daño del ataque.
        @param attackDamage Nuevo daño del ataque.
    */
    void setAttackDamage(int attackDamage);

    /**
        Método que retorna el daño del ataque.
        @return int Daño del ataque.
    */
    int getAttackDamage();
}
