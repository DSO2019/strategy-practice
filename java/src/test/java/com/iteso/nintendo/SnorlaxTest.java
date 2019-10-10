package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class SnorlaxTest {
    Snorlax snorlax;

    @Before
    public void setUp(){
        snorlax = new Snorlax();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with sleep causing a damage of 0", snorlax.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with earthquake causing a damage of 25", snorlax.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 77", snorlax.defend(0));
    }

    /** Name test */
    @Test
    public void test_name(){
        assertEquals("Snorlax", snorlax.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve(){
        assertEquals(null, snorlax.evolve());
    }

    /** Type test */
    @Test
    public void test_type(){
        assertEquals("normal", snorlax.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution(){
        assertEquals(false, snorlax.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Sleep", snorlax.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Earthquake", snorlax.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(0, snorlax.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(25, snorlax.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints(){
        assertEquals(100, snorlax.getHitPoints());
    }

}