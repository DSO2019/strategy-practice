package com.iteso.nintendo.characters;

import com.iteso.nintendo.characters.Bulbasur;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Isaac Cabrera on 2/24/18.
 */
public class BulbasurTest {

    Bulbasur bulbasur;
    
    @Before
    public void setUp() {
        bulbasur = new Bulbasur();
    }

    /** Main attack test. */
    @Test
    public void maintAttackTest() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 7", bulbasur.mainAttack());
    }

    /** Second attack test. */
    @Test
    public void secondAttackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 13", bulbasur.secondAttack());
    }

    /** Defense test */
    @Test
    public void defendTest() {
        assertEquals("Defending attack, damage caused is 1 new HP is 76", bulbasur.defend(5));
    }

    /** Name test */
    @Test
    public void getNameTest() {
        assertEquals("Bulbasur", bulbasur.getName());
    }

    /** Evolve test */
    @Test
    public void evolveTest() {
        assertEquals(null, bulbasur.evolve());
    }

    /** Type test */
    @Test
    public void typeTest() {
        assertEquals("planta", bulbasur.getType());
    }

    /** Evolvution test */
    @Test
    public void hasEvolutionTest() {
        assertEquals(false, bulbasur.hasEvolution());
    }

    /** Main Damage test */
    @Test
    public void getMainAttackDamageTest() {
        assertEquals(7, bulbasur.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void getSecondAttackDamageTest() {
        assertEquals(13, bulbasur.getSecondAttackDamage());
    }

    /** Hit points test */
    @Test
    public void getHitPointsTest() {
        assertEquals(77, bulbasur.getHitPoints());
    }

    /** Defense multiplier test */
    @Test
    public void getDefenseMultiplierTest() {
        assertEquals(0.3, bulbasur.getDefenseMultiplier(), 0.0);
    }
}
