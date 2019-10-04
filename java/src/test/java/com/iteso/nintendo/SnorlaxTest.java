package com.iteso.nintendo;

import com.iteso.nintendo.Snorlax;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AlfredoRodriguez on 2/24/18.
 */
public class SnorlaxTest {
    Snorlax snorlax;

    @Before
    public void setUp() {
        snorlax = new Snorlax();
    }

    /** First attack */
    @Test
    public void firstAttack() {
        assertEquals("Attacking opponent with Slam causing a damage of 15", snorlax.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Tackle causing a damage of 10", snorlax.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 0 new HP is 150", snorlax.defend(0));
    }

    /** Name test */
    @Test
    public void test_name() {
        assertEquals("Snorlax", snorlax.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve() {
        assertEquals(null, snorlax.evolve());
    }

    /** Type test */
    @Test
    public void test_type() {
        assertEquals("useless", snorlax.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution() {
        assertEquals(false, snorlax.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain() {
        assertEquals("Slam", snorlax.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary() {
        assertEquals("Tackle", snorlax.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage() {
        assertEquals(15, snorlax.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage() {
        assertEquals(10, snorlax.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints() {
        assertEquals(150, snorlax.getHitPoints());
    }

}
