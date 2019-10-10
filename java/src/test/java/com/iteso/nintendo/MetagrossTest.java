package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class MetagrossTest {
    Metagross metagross;

    @Before
    public void setUp(){
        metagross = new Metagross();
    }

    /** Metagross main attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with MetalClaw causing a damage of 12", metagross.mainAttack());
    }

    /** Metagross secundary attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Psychic causing a damage of 20", metagross.secondAttack());
    }

    /** Metagross Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("MetalClaw", metagross.getMainAttack());
    }

    /** Metagross Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Psychic", metagross.getMainAttack());
    }

    /** Metagross Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(12, metagross.getMainAttackDamage());
    }

    /** Metagross Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(20, metagross.getSecondAttackDamage());
    }


}