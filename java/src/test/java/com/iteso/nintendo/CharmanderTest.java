package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CharmanderTest {
    /**
     * Charmander object.
     */
    Charmander charmander;
    /**
     * Set up for the character.
     */
    @Before
    public void setUp(){
        charmander = new Charmander();
    }
    /**
     * Test of the mainAttack;
     */
    @Test
    public void mainAttack(){
        assertEquals("Attacking opponent with Small Fire causing damage of 20", charmander.mainAttack());
    }
    /**
     * Test of the secondAttack;
     */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Big Fire causing damage of 30", charmander.mainAttack());
    }
}
