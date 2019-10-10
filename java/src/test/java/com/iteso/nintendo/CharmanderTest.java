package com.iteso.nintendo;

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

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with FirePunch causing a damage of 22", charmander.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with earthquake causing a damage of 25", charmander.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 77", charmander.defend(0));
    }

    /** Name test */
    @Test
    public void test_name(){
        assertEquals("Charmander", charmander.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve(){
        assertEquals(null, charmander.evolve());
    }

    /** Type test */
    @Test
    public void test_type(){
        assertEquals("fire", charmander.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution(){
        assertEquals(false, charmander.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("FirePunch", charmander.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Earthquake", charmander.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(22, charmander.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(25, charmander.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints(){
        assertEquals(77, charmander.getHitPoints());
    }

}