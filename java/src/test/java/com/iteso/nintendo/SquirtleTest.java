package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class SquirtleTest {
    Squirtle squirtle;
    @Before
    public void setUp() {
        squirtle = new Squirtle();
    }

    @Test
    public void mainAttack() {
        assertEquals("Squirtle confundelo >.<", squirtle.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Squirtle sopla! y marealo con tu horrible aliento", squirtle.secondAttack());
    }
}

