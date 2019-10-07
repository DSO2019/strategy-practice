package com.iteso.nintendo.pokemons;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class LucarioTest {
    Lucario lucario;

    @Before
    public void setUp(){
        lucario = new Lucario();
    }

    /** Main attack test. */
    @Test
    public void mainAttackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 3", lucario.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Quick Attack causing a damage of 5", lucario.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 77", lucario.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Lucario", lucario.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, lucario.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("fighter", lucario.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, lucario.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(3, lucario.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(5, lucario.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(77, lucario.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.3, lucario.getDefenseMultiplier(), 0.0);
    }
}
