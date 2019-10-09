package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CharizardTest {
    Charizard charizard;

    @Before
    public void setUp(){
        charizard = new Charizard();
    }

    /** Main attack test. */
    @Test
    public void mainAttackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 3", charizard.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Quick Attack causing a damage of 5", charizard.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 77", charizard.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Charizard", charizard.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, charizard.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("fire", charizard.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, charizard.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(3, charizard.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(5, charizard.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(77, charizard.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.3, charizard.getDefenseMultiplier(), 0.0);
    }
}
