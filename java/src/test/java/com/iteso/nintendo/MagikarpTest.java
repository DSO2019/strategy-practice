package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagikarpTest {
    Magikarp magikarp;

    @Before
    public void setUp() {
        magikarp = new Magikarp();
    }

    @Test
    public void mainAttack() {
        assertEquals("Magikarp usa Ember!", magikarp.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Magikarp usa Ghost Ball!", magikarp.secondAttack());
    }
}