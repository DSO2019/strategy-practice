package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharmanderTest {
    Charmander charmander;

    @Before
    public void setUp() {
        charmander = new Charmander();
    }

    @Test
    public void mainAttack() {
        assertEquals("Charmander usa Ember!", charmander.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Charmander usa Splash! No pasa absolutamente nada...", charmander.secondAttack());
    }
}