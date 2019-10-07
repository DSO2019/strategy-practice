package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HadoukenTest {
    Hadouken hadouken;

    @Before
    public void setUp() {
        hadouken = new Hadouken();
    }

    @Test
    public void testAttack() {
        assertEquals(hadouken.attack(), "Hadouken");
    }

    @Test
    public void testAttackDamage() {
        hadouken.setAttackDamage(66);
        assertEquals(hadouken.getAttackDamage(), 66);
    }
}
