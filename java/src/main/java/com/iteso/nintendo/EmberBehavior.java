package com.iteso.nintendo;

public class EmberBehavior implements AttackBehavior {
    int attackDamage = 8;
    String attackName = "Ember";
    /**
     * @return the attackDamage
     */
    
    @Override
    public int getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public void setAttackDamage(int newDmg) {
        this.attackDamage = newDmg;
    }

    @Override
    public String getAttack() {
        return this.attackName;
    }

    @Override
    public void setAttack(String newAttack) {
        this.attackName = newAttack;
    }


    @Override
    public String attack(){
        return "Attacking opponent with " + attackName + " causing a damage of " + getAttackDamage();
    }
}