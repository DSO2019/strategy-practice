package com.iteso.nintendo.characters;

import com.iteso.nintendo.characters.Golduck;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Isaac Cabrera on 2/24/18.
 */
public class GolduckTest {

    Golduck golduck;
    
    @Before
    public void setUp() {
        golduck = new Golduck();
    }

    /** Main attack test. */
    @Test
    public void maintAttackTest() {
        assertEquals("Attacking opponent with Aqua Jet causing a damage of 18", golduck.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 13", golduck.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 0 new HP is 77", golduck.defend(0));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Golduck", golduck.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, golduck.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("agua", golduck.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(true, golduck.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(18, golduck.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(13, golduck.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(77, golduck.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.3, golduck.getDefenseMultiplier(), 0.0);
    }
}
