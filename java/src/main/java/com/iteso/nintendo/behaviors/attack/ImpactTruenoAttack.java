package com.iteso.nintendo.behaviors.attack;

/**
    Ataque de relampago ImpactTruenoAttack.
 */
public class ImpactTruenoAttack implements Attack {

    /** Default damage. */
    private static final int DEFAULT_ATTACK_DAMAGE = 13;
     /** Daño ocasionado por el ataque. */
    private int attackDamage = DEFAULT_ATTACK_DAMAGE;
    /** Nombre del ataque. */
    private String attackName = "Quick Attack";

    /**
        Método que lleva a cabo el ataque.
        @return String Log del ataque.
    */
    @Override
    public String attack() {
            return "Attacking opponent with " + attackName
                    + " causing a damage of " + attackDamage;
    }

    /**
        Método que actualiza el nombre del ataque.
        @param newAttackName Nuevo nombre del ataque.
     */
    @Override
    public void setAttackName(final String newAttackName) {
        this.attackName = newAttackName;
    }

    /**
        Método que retorna el nombre del ataque.
        @return String Nombre del ataque.
     */
    @Override
    public String getAttackName() {
        return this.attackName;
    }

    /**
        Metodo que actualiza el daño ocasionado por el
        ataque.
        @param newAttackDamage Nuevo daño del ataque.
     */
    @Override
    public void setAttackDamage(final int newAttackDamage) {
        this.attackDamage = newAttackDamage;
    }

    /**
        Método que retorna el daño del ataque.
        @return int Daño del ataque.
     */
    @Override
    public int getAttackDamage() {
        return this.attackDamage;
    }
}
