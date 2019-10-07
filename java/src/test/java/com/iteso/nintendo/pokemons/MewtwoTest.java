package com.iteso.nintendo.pokemons;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class MewtwoTest {
    Mewtwo mewtwo;

    @Before
    public void setUp(){
        mewtwo = new Mewtwo();
    }

    /** Main attack test. */
    @Test
    public void mainAttackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 17", mewtwo.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Cosmic Power causing a damage of 25", mewtwo.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 105", mewtwo.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Mewtwo", mewtwo.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, mewtwo.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("Psychic", mewtwo.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, mewtwo.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(17, mewtwo.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(25, mewtwo.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(105, mewtwo.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.6, mewtwo.getDefenseMultiplier(), 0.0);
    }
}
