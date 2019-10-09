package com.iteso.nintendo;
/**
 * Created by rvillalobos on 2/24/18.
 */
public class SmallFireBehavior implements AttackBehavior {
    /**No magic number. */
    private static final int ATTACK_DAMAGE = 3;
    /**attack damage. */
    private int attackDamage = ATTACK_DAMAGE;
    /**attack name. */
    private String attackName = "Small Fire";
    /**
     * @return the attackDamage
     */
    @Override
    public int getAttackDamage() {
        return this.attackDamage;
    }
    /**
     * @param newDmg attackDamage.
     */
    @Override
    public void setAttackDamage(final int newDmg) {
        this.attackDamage = newDmg;
    }
    /**
     * @return attack name.
     */
    @Override
    public String getAttack() {
        return this.attackName;
    }
    /**
     * @param newAttack attackname.
     */
    @Override
    public void setAttack(final String newAttack) {
        this.attackName = newAttack;
    }
    /**
     * @return attack.
     */
    @Override
    public String attack() {
        return "Attacking opponent with " + attackName
                    + " causing a damage of " + getAttackDamage();
    }
}
