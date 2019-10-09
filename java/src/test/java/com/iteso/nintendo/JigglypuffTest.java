package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class JigglypuffTest {
    /**
     * Jigglypuff object.
     */
    Jigglypuff jigglypuff;
    /**
     * Set up for the character.
     */
    @Before
    public void setUp(){
        jigglypuff = new Jigglypuff();
    }
    /**
     * Test of the mainAttack;
     */
    @Test
    public void mainAttack(){
        assertEquals("Attacking opponent with Quick Attack causing damage of 30", pikachu.mainAttack());
    }
    /**
     * Test of the secondAttack;
     */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Impact Trueno causing damage of 20", pikachu.mainAttack());
    }
}