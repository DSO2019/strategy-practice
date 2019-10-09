package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class LucarioTest {
    /**
     * Lucario object.
     */
    Lucario lucario;
    /**
     * Set up for the character.
     */
    @Before
    public void setUp(){
        lucario = new Lucario();
    }
    /**
     * Test of the mainAttack;
     */
    @Test
    public void mainAttack(){
        assertEquals("Attacking opponent with Small Fire causing damage of 20", lucario.mainAttack());
    }
    /**
     * Test of the secondAttack;
     */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Big Fire causing damage of 30", lucario.mainAttack());
    }
}
