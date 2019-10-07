package com.iteso.nintendo.pokemons;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class ArceusTest {
    Arceus arceus;

    @Before
    public void setUp(){
        arceus = new Arceus();
    }

    /** Main attack test. */
    @Test
    public void mainAttackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 17", arceus.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Cosmic Power causing a damage of 25", arceus.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 120", arceus.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Arceus", arceus.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, arceus.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("normal", arceus.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, arceus.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(17, arceus.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(25, arceus.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(120, arceus.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.7, arceus.getDefenseMultiplier(), 0.0);
    }
}
