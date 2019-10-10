package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class ArticunoTest {
    Articuno articuno;

    @Before
    public void setUp(){
        articuno = new Articuno();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with iceBeam causing a damage of 18", articuno.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with earthquake causing a damage of 25", articuno.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 77", articuno.defend(0));
    }

    /** Name test */
    @Test
    public void test_name(){
        assertEquals("Articuno", articuno.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve(){
        assertEquals(null, articuno.evolve());
    }

    /** Type test */
    @Test
    public void test_type(){
        assertEquals("ice", articuno.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution(){
        assertEquals(false, articuno.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("IceBeam", articuno.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Earthquake", articuno.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(18, articuno.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(25, articuno.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints(){
        assertEquals(77, articuno.getHitPoints());
    }

}