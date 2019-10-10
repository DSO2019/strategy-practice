package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class AlakazamTest {
    Alakazam alakazam;

    @Before
    public void setUp(){
        alakazam = new Alakazam();
    }

    /** Alakazam main attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Psychic causing a damage of 20", alakazam.mainAttack());
    }

    /** Alakazam secundary attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Tunderpunch causing a damage of 18", alakazam.secondAttack());
    }

    /** Alakazam Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Psychic", alakazam.getMainAttack());
    }

    /** Alakazam Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Tunderpunch", alakazam.getMainAttack());
    }

    /** Alakazam Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(20, alakazam.getMainAttackDamage());
    }

    /** Alakazam Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(18, alakazam.getSecondAttackDamage());
    }


}