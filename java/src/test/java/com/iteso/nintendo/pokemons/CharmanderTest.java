package com.iteso.nintendo.pokemons;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CharmanderTest {
    Charmander charmander;

    @Before
    public void setUp(){
        charmander = new Charmander();
    }

    /** Main attack test. */
    @Test
    public void mainAttackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 3", charmander.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 17", charmander.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 77", charmander.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Charmander", charmander.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, charmander.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("fire", charmander.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, charmander.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(3, charmander.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(17, charmander.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(77, charmander.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.3, charmander.getDefenseMultiplier(), 0.0);
    }
}
