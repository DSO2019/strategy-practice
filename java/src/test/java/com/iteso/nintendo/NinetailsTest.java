package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class NinetailsTest {
    Ninetails ninetails;

    @Before
    public void setUp(){
        ninetails = new Ninetails();
    }

    /** Ninetails main attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Flamethrower causing a damage of 15", ninetails.mainAttack());
    }

    /** Ninetails secundary attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Ember causing a damage of 12", ninetails.secondAttack());
    }

    /** Ninetails Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Flamethrower", ninetails.getMainAttack());
    }

    /** Ninetails Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Ember", ninetails.getMainAttack());
    }

    /** Ninetails Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(15, ninetails.getMainAttackDamage());
    }

    /** Ninetails Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(12, ninetails.getSecondAttackDamage());
    }


}