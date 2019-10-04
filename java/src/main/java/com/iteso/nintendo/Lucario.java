package com.iteso.nintendo;
/**
 * Created by rvillalobos on 2/24/18.
 */
public class Lucario extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;

    /**
     * Pikachu constructor.
     */
    public Lucario() {
    	SmallFire sf = new SmallFire();
    	BigFire bf = new BigFire();
        setType("steel");
        setName("Lucario");
        setHasEvolution(true);
        setSecondAttack(bf);
        setMainAttack(sf);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(bf.getAttackDamage());
        setSecondAttackDamage(sf.getAttackDamage());
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final int attack) {
        int damage;

        damage = (int) (attack * getDefenseMultiplier());
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    @Override
    public final String secondAttack() {

        String attackMessage = new String("Attacking opponent with "
                + getSecondAttack()
                + " causing a damage of " + getSecondAttackDamage());
        return attackMessage;


    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String("Attacking opponent with "
                + getMainAttack()
                + " causing a damage of " + getMainAttackDamage());
        return attackMessage;

    }

    @Override
    public final void setNewAttack(final int attack, final int attackDamage,
                                   final IAttack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }

	@Override
	public String getAttack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAttackDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAttackDamage(int newAttackDamage) {
		// TODO Auto-generated method stub
		
	}


}