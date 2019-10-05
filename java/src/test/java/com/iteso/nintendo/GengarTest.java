package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GengarTest {
    Gengar gengar;

    @Before
    public void setUp() {
        gengar = new Gengar();
    }

    @Test
    public void mainAttack() {
        assertEquals("Gengar usa Ember!", gengar.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Gengar usa Ghost Ball!", gengar.secondAttack());
    }
}