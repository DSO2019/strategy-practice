package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class GengarTest {
    Gengar gengar;

    @Before
    public void setUp(){
        gengar = new Gengar();
    }

    /** Gengar main attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Psychic causing a damage of 20", gengar.mainAttack());
    }

    /** Gengar secundary attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Tunderpunch causing a damage of 18", gengar.secondAttack());
    }

    /** Gengar Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Psychic", gengar.getMainAttack());
    }

    /** Gengar Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Tunderpunch", gengar.getMainAttack());
    }

    /** Gengar Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(20, gengar.getMainAttackDamage());
    }

    /** Gengar Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(18, gengar.getSecondAttackDamage());
    }


}