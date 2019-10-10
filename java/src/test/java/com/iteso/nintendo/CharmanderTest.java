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

    /** Charmander main attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Flamethrower causing a damage of 15", charmander.mainAttack());
    }

    /** Charmander secundary attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with MetalClaw causing a damage of 12", charmander.secondAttack());
    }

    /** Charmander Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Flamethrower", charmander.getMainAttack());
    }

    /** Charmander Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("MetalClaw", charmander.getMainAttack());
    }

    /** Charmander Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(15, charmander.getMainAttackDamage());
    }

    /** Charmander Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(12, charmander.getSecondAttackDamage());
    }


}