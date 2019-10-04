package com.iteso.nintendo;
/**
 * clase Gigaimpact.
 */
public class Gigaimpact implements Ataque {
    /**
     * damagevalor.
     */
    private static final int DAM = 20;

    /**
     * damage.
     */
   private int damage = DAM;
    /**
     * metodo para atacar.
     * @return mensaje.
     */
    public final String atacaprro() {
         String mensajeparaatacar =
                 new String("usa giga Impact y entierralo");
        return mensajeparaatacar;
    };
    /**
     * metodo getattackdamage.
     * @return damage.
     */
    @Override
    public final int getAttackDamage() {
        return this.damage;
    }
}
