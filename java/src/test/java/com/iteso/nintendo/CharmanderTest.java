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
    public void setUp() {
        charmander = new Charmander();
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Dig causing a damage of 80", charmander.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Earthquake causing a damage of 80", charmander.secondAttack());
    }
}