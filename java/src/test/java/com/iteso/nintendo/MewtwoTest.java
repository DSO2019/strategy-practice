package com.iteso.nintendo;

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

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with iceBeam causing a damage of 18", mewtwo.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with earthquake causing a damage of 25", mewtwo.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 100", mewtwo.defend(0));
    }

    /** Name test */
    @Test
    public void test_name(){
        assertEquals("Mewtwo", mewtwo.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve(){
        assertEquals(null, mewtwo.evolve());
    }

    /** Type test */
    @Test
    public void test_type(){
        assertEquals("psycho", mewtwo.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution(){
        assertEquals(false, mewtwo.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("IceBeam", mewtwo.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Earthquake", mewtwo.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(18, mewtwo.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(25, mewtwo.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints(){
        assertEquals(100, mewtwo.getHitPoints());
    }
}