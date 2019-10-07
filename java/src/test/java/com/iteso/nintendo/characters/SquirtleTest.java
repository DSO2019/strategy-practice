package com.iteso.nintendo.characters;

import com.iteso.nintendo.characters.Squirtle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Isaac Cabrera on 2/24/18.
 */
public class SquirtleTest {

    Squirtle squirtle;
    
    @Before
    public void setUp() {
        squirtle = new Squirtle();
    }

    /** Main attack test. */
    @Test
    public void maintAttackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 7", squirtle.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 13", squirtle.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 77", squirtle.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Squirtle", squirtle.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, squirtle.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("agua", squirtle.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, squirtle.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(7, squirtle.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(13, squirtle.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(77, squirtle.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.3, squirtle.getDefenseMultiplier(), 0.0);
    }
}
